package com.cikada.zhelezoapi.util

import com.cikada.zhelezoapi.model.category.AbstractCategory
import com.cikada.zhelezoapi.model.category.FormFactor
import com.cikada.zhelezoapi.model.category.MainMemoryType
import com.cikada.zhelezoapi.model.category.Socket
import com.cikada.zhelezoapi.model.part.AbstractPartEntity
import com.cikada.zhelezoapi.model.part.Case
import com.cikada.zhelezoapi.model.part.MainMemory
import com.cikada.zhelezoapi.model.part.Motherboard
import com.cikada.zhelezoapi.model.part.PowerSupply
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

val objectMapper = ObjectMapper()

var sockets = listOf(
    Socket().apply { name = "LGA1151" },
    Socket().apply { name = "AM4" },
    Socket().apply { name = "AM3" }
)
var formFactors = listOf(
    FormFactor().apply { name = "ATX" },
    FormFactor().apply { name = "Mini-ITX" },
    FormFactor().apply { name = "MicroATX" },
    FormFactor().apply { name = "Desktop" }
)
var mainMemoryTypes = listOf(
    MainMemoryType().apply { name = "DDR1" },
    MainMemoryType().apply { name = "DDR2" },
    MainMemoryType().apply { name = "DDR3" },
    MainMemoryType().apply { name = "DDR4" },
    MainMemoryType().apply { name = "DDR5" }
)

val regexTB = "[0-9]+(?=TB)".toRegex()
val regexGB = "[0-9]+(?=GB)".toRegex()

fun KClass<out AbstractPartEntity>.getPartsFromJson(): List<AbstractPartEntity> = run {

    val path = getJsonFileByPart()

    val partsFromJson = objectMapper
        .readValue(
            File(path),
            object : TypeReference<List<PartFromJson>>() {}
        )
    val parts = partsFromJson.mapJsonToParts(this)
    if (parts.first() is Storage)
        (parts as List<Storage>).setMemoryDataByName()

    return parts
}

private fun List<Storage>.setMemoryDataByName() = forEach {
    it.memory = regexGB.find(it.name!!)
        ?.run { this.value.toInt() }
        ?: regexTB.find(it.name!!)!!.value.toInt() * 1000
}

private fun List<PartFromJson>.mapJsonToParts(clazz: KClass<out AbstractPartEntity>) = this.map {
    it.mapJsonToPart(clazz)
}

private fun PartFromJson.mapJsonToPart(clazz: KClass<out AbstractPartEntity>): AbstractPartEntity = let { from ->
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

fun AbstractPartEntity.setAdditionalProperties() {
    this::class.memberProperties.forEach { member ->
        member.setByMember(this)
    }
}

private fun KProperty1<out AbstractPartEntity, *>.setByMember(part: AbstractPartEntity) = let { member ->
    if (member is KMutableProperty<*>) {
        when (this.name) {
            "socket" -> member.setter.call(part, part.findCategoryDataByClazz(sockets))
            "formFactor" -> member.setter.call(part, part.findCategoryDataByClazz(formFactors))
            "mainMemoryType" -> member.setter.call(part, part.findCategoryDataByClazz(mainMemoryTypes))
            else -> Unit
        }
    }
}

private fun AbstractPartEntity.findCategoryDataByClazz(list: List<AbstractCategory>) = let { part ->
    list.firstOrNull {
        part.description!!.contains(it.name!!, ignoreCase = true) || part.name!!.contains(it.name!!, ignoreCase = true)
    }
}

private fun KClass<out AbstractPartEntity>.getJsonFileByPart() = "./src/main/resources/json/${when (this) {
    Case::class -> "case"
    MainMemory::class -> "main_memory"
    Motherboard::class -> "motherboard"
    PowerSupply::class -> "power_suit"
    Processor::class -> "processor"
    Storage::class -> "storage"
    VideoCard::class -> "video_card"
    else -> "empty"
}}.json"