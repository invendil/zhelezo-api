package com.cikada.zhelezoapi.util

import com.cikada.zhelezoapi.model.category.AbstractCategory
import com.cikada.zhelezoapi.model.category.FormFactor
import com.cikada.zhelezoapi.model.category.MainMemoryType
import com.cikada.zhelezoapi.model.category.Socket
import com.cikada.zhelezoapi.model.part.AbstractPartEntity
import com.cikada.zhelezoapi.model.part.Case
import com.cikada.zhelezoapi.model.part.MainMemory
import com.cikada.zhelezoapi.model.part.Motherboard
import com.cikada.zhelezoapi.model.part.PowerSuit
import com.cikada.zhelezoapi.model.part.Processor
import com.cikada.zhelezoapi.model.part.Storage
import com.cikada.zhelezoapi.model.part.VideoCard
import com.cikada.zhelezoapi.payload.PartFromJson
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.File
import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty
import kotlin.reflect.KProperty1
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.memberProperties

var objectMapper = ObjectMapper()

var sockets = listOf(
    Socket().apply { name = "Socket LGA 1151" },
    Socket().apply { name = "Socket AM4" },
    Socket().apply { name = "Socket LGA 2066" }
)
var formFactors = listOf(
    FormFactor().apply { name = "ATX" },
    FormFactor().apply { name = "Mini-ITX" },
    FormFactor().apply { name = "microATX" },
    FormFactor().apply { name = "Desktop" }
)
var mainMemoryTypes = listOf(
    MainMemoryType().apply { name = "DDR1" },
    MainMemoryType().apply { name = "DDR2" },
    MainMemoryType().apply { name = "DDR3" },
    MainMemoryType().apply { name = "DDR4" },
    MainMemoryType().apply { name = "DDR5" }
)

fun KClass<out AbstractPartEntity>.getPartsFromJson(): List<AbstractPartEntity> = run {

    val path = getJsonFileByPart()

    val partsFromJson = objectMapper
        .readValue(
            File(path),
            object : TypeReference<List<PartFromJson>>() {}
        )
    val parts = partsFromJson.mapJsonToParts(this)
    return parts
}

fun List<PartFromJson>.mapJsonToParts(clazz: KClass<out AbstractPartEntity>) = this.map {
    it.mapJsonToPart(clazz)
}

fun PartFromJson.mapJsonToPart(clazz: KClass<out AbstractPartEntity>): AbstractPartEntity = let { from ->
    val part = clazz.createInstance().apply {
        description = from.description
        name = from.fullName
        price = from.prices!!.priceMin!!.amount!!.toBigDecimal()
        imgUrl = from.images!!.header
    }
    part::class.memberProperties.forEach { member ->
        member.setByMember(part)
    }
    return part
}

fun KProperty1<out AbstractPartEntity, *>.setByMember(part: AbstractPartEntity) = let { member ->
    if (member is KMutableProperty<*>) {
        when (this.name) {
            "socket" -> member.setter.call(part, part.findSocketByClazz(sockets))
            "formFactor" -> member.setter.call(part, part.findSocketByClazz(formFactors))
            "mainMemoryType" -> member.setter.call(part, part.findSocketByClazz(mainMemoryTypes))
            else -> Unit
        }
    }
}


fun AbstractPartEntity.findSocketByClazz(list: List<AbstractCategory>) = let { part ->
    list.firstOrNull {
        part.description!!.contains(it.name!!, ignoreCase = true) || part.name!!.contains(it.name!!, ignoreCase = true)
    }
}

fun KClass<out AbstractPartEntity>.getJsonFileByPart() = "./src/main/resources/json/${when (this) {
    Case::class -> "case"
    MainMemory::class -> "main_memory"
    Motherboard::class -> "motherboard"
    PowerSuit::class -> "power_suit"
    Processor::class -> "processor"
    Storage::class -> "storage"
    VideoCard::class -> "video_card"
    else -> "empty"
}}.json"