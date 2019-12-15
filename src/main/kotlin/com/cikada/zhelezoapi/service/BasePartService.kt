package com.cikada.zhelezoapi.service

import com.cikada.zhelezoapi.exception.ResourceNotFoundException
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
//    @Autowired
//    protected lateinit var caseRepository: AbstractRepository<Case>
//    @Autowired
//    protected lateinit var mainMemoryRepository: AbstractRepository<MainMemory>
//    @Autowired
//    protected lateinit var motherboardRepository: AbstractRepository<Motherboard>
//    @Autowired
//    protected lateinit var powerSuitRepository: AbstractRepository<PowerSuit>
//    @Autowired
//    protected lateinit var processorRepository: AbstractRepository<Processor>
//    @Autowired
//    protected lateinit var storageRepository: AbstractRepository<Storage>
//    @Autowired
//    protected lateinit var videoCardRepository: AbstractRepository<VideoCard>

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


//    val repositories by lazy {
//        mapOf(
//            Case::class to caseRepository,
//            MainMemory::class to mainMemoryRepository,
//            Motherboard::class to motherboardRepository,
//            PowerSuit::class to powerSuitRepository,
//            Processor::class to processorRepository,
//            Storage::class to storageRepository,
//            VideoCard::class to videoCardRepository
//        )
//    }
//
//    fun AbstractPartEntity.repository() = repositories[this::class]?.save(this)
//



}