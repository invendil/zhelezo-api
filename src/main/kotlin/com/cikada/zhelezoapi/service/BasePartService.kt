package com.cikada.zhelezoapi.service

import com.cikada.zhelezoapi.model.part.AbstractPartEntity
import com.cikada.zhelezoapi.model.part.Case
import com.cikada.zhelezoapi.model.part.MainMemory
import com.cikada.zhelezoapi.model.part.Motherboard
import com.cikada.zhelezoapi.model.part.PowerSuit
import com.cikada.zhelezoapi.model.part.Processor
import com.cikada.zhelezoapi.model.part.Storage
import com.cikada.zhelezoapi.model.part.VideoCard
import com.cikada.zhelezoapi.repository.AbstractRepository
import com.cikada.zhelezoapi.repository.CaseRepository
import com.cikada.zhelezoapi.repository.MainMemoryRepository
import com.cikada.zhelezoapi.repository.MotherboardRepository
import com.cikada.zhelezoapi.repository.PowerSuitRepository
import com.cikada.zhelezoapi.repository.ProcessorRepository
import com.cikada.zhelezoapi.repository.StorageRepository
import com.cikada.zhelezoapi.repository.VideoCardRepository
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
                    PowerSuit::class to powerSuitRepository,
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
            "powerSuit" to PowerSuit::class,
            "processor" to Processor::class,
            "storage" to Storage::class,
            "videoCard" to VideoCard::class
        )
    }
}