package com.cikada.zhelezoapi.service

import com.cikada.zhelezoapi.exception.ResourceNotFoundException
import com.cikada.zhelezoapi.model.part.AbstractPartEntity
import com.cikada.zhelezoapi.model.part.Case
import com.cikada.zhelezoapi.model.part.MainMemory
import com.cikada.zhelezoapi.model.part.Motherboard
import com.cikada.zhelezoapi.model.part.PowerSuit
import com.cikada.zhelezoapi.model.part.Processor
import com.cikada.zhelezoapi.model.response.BuildResponse
import com.cikada.zhelezoapi.model.response.ErrorResponse
import com.cikada.zhelezoapi.model.response.PartResponse
import org.springframework.stereotype.Service
import kotlin.reflect.KClass

@Service
class PartService : BasePartService() {

    fun checkBuild(build: BuildResponse): List<ErrorResponse> {
        val partEntityList = mutableListOf<AbstractPartEntity>()

        build.partList!!.forEach {
            partEntityList.add(it.findEntityByPartResponse())
        }

        val partEntityByClazzMap: Map<KClass<out AbstractPartEntity>, AbstractPartEntity> =
            partEntityList
                .map { from -> from::class to from }
                .toMap()

        return partEntityByClazzMap.checkPartEntities()
    }

    fun findPartsByPartType(type: String): List<PartResponse> {
        val entities = (repositoryMapByTypeName[type] ?: error("Repository not found"))
            .findAll().toList()

        return entities.map { from ->
            PartResponse(
                name = from.name,
                description = from.description,
                imgUrl = from.imgUrl,
                price = from.price
            )
        }
    }

    private fun PartResponse.findEntityByPartResponse() = repositoryMapByTypeName[typeName]!!
            .findByName(name!!)
            .orElseThrow { ResourceNotFoundException(typeName, "name", name!!) }


    private fun Map<KClass<out AbstractPartEntity>, AbstractPartEntity>.checkPartEntities(): List<ErrorResponse> {
        val errors = mutableListOf<ErrorResponse>()

        if (this[Case::class] != null && this[Motherboard::class] != null)
            if (
                (this[Case::class] as Case).formFactor !=
                (this[Motherboard::class] as Motherboard).formFactor
            ) {
                errors.add(
                    ErrorResponse(
                        message = "Formfactor не совпадает!",
                        categoryName = "formFactor"
                    )
                )
            }

        if (this[MainMemory::class] != null && this[Motherboard::class] != null)
            if (
                (this[MainMemory::class] as MainMemory).mainMemoryType !=
                (this[Motherboard::class] as Motherboard).mainMemoryType
            ) {
                errors.add(
                    ErrorResponse(
                        message = "Тип оперативной памяти не совпадает!",
                        categoryName = "mainMemoryType"
                    )
                )
            }

        if (this[Processor::class] != null && this[Motherboard::class] != null)
            if (
                (this[Processor::class] as Processor).socket !=
                (this[Motherboard::class] as Motherboard).socket
            ) {
                errors.add(
                    ErrorResponse(
                        message = "Сокет процессора не совпадает!",
                        categoryName = "socket"
                    )
                )
            }

        return errors.toList()
    }

//    fun saveBuildFull(buildFull: BuildResponse) {
//        repositoryList[1].save(Case())
//        if(buildFull.case != null) caseRepository.save(buildFull.case)
//        if(buildFull.mainMemory != null) mainMemoryRepository.save(buildFull.mainMemory)
//        if(buildFull.motherboard != null) motherboardRepository.save(buildFull.motherboard)
//        if(buildFull.powerSuit != null) powerSuitRepository.save(buildFull.powerSuit)
//        if(buildFull.processor != null) processorRepository.save(buildFull.processor)
//        if(buildFull.storage != null) storageRepository.save(buildFull.storage)
//        if(buildFull.videoCard != null) videoCardRepository.save(buildFull.videoCard)
//    }


}