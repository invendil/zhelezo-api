package com.cikada.zhelezoapi.service

import com.cikada.zhelezoapi.model.part.*
import com.cikada.zhelezoapi.repository.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import kotlin.reflect.KClass

@Service
open class BasePartService {

    @Autowired
    protected lateinit var caseRepository: CaseRepository
    @Autowired
    protected lateinit var mainMemoryRepository: MainMemoryRepository
    @Autowired
    protected lateinit var motherboardRepository: MotherboardRepository
    @Autowired
    protected lateinit var powerSuitRepository: PowerSuitRepository
    @Autowired
    protected lateinit var processorRepository: ProcessorRepository
    @Autowired
    protected lateinit var storageRepository: StorageRepository
    @Autowired
    protected lateinit var videoCardRepository: VideoCardRepository


    protected val repositoryMapByTypeName: Map<String, AbstractRepository<out AbstractPartEntity>> by lazy {
        mapOf(
            "case" to caseRepository,
            "mainMemory" to mainMemoryRepository,
            "motherboard" to motherboardRepository,
            "powerSuit" to powerSuitRepository,
            "processor" to processorRepository,
            "storage" to storageRepository,
            "videoCard" to videoCardRepository
        )
    }

    protected val repositoryMapByClazz: Map<KClass<out AbstractPartEntity>, AbstractRepository<out AbstractPartEntity>>
            by lazy {
                mapOf(
                    Case::class to caseRepository,
                    MainMemory::class to mainMemoryRepository,
                    Motherboard::class to motherboardRepository,
                    PowerSupply::class to powerSuitRepository,
                    Processor::class to processorRepository,
                    Storage::class to storageRepository,
                    VideoCard::class to videoCardRepository
                )
            }

    companion object {
        val typeNameToClazzMap: Map<String, KClass<out AbstractPartEntity>> = mapOf(
            "case" to Case::class,
            "mainMemory" to MainMemory::class,
            "motherboard" to Motherboard::class,
            "powerSuit" to PowerSupply::class,
            "processor" to Processor::class,
            "storage" to Storage::class,
            "videoCard" to VideoCard::class
        )
    }
}