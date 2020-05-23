package com.cikada.zhelezoapi.service

import com.cikada.zhelezoapi.model.part.*
import com.cikada.zhelezoapi.repository.FormFactorRepository
import com.cikada.zhelezoapi.repository.MainMemoryTypeRepository
import com.cikada.zhelezoapi.repository.SocketRepository
import com.cikada.zhelezoapi.util.formFactors
import com.cikada.zhelezoapi.util.getPartsFromJson
import com.cikada.zhelezoapi.util.mainMemoryTypes
import com.cikada.zhelezoapi.util.sockets
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.io.IOException

@Service
class InitService : BasePartService() {
    @Autowired
    lateinit var socketRepository: SocketRepository
    @Autowired
    lateinit var formFactorRepository: FormFactorRepository
    @Autowired
    lateinit var mainMemoryTypeRepository: MainMemoryTypeRepository

    @Throws(IOException::class)
    fun initParts() {
        sockets = socketRepository.findAll().toList()
        formFactors = formFactorRepository.findAll().toList()
        mainMemoryTypes = mainMemoryTypeRepository.findAll().toList()
        caseRepository.saveAll(Case::class.getPartsFromJson().filterIsInstance<Case>())
        mainMemoryRepository.saveAll(MainMemory::class.getPartsFromJson().filterIsInstance<MainMemory>())
        motherboardRepository.saveAll(Motherboard::class.getPartsFromJson().filterIsInstance<Motherboard>())
        powerSuitRepository.saveAll(PowerSupply::class.getPartsFromJson().filterIsInstance<PowerSupply>())
        processorRepository.saveAll(Processor::class.getPartsFromJson().filterIsInstance<Processor>())
        storageRepository.saveAll(Storage::class.getPartsFromJson().filterIsInstance<Storage>())
        videoCardRepository.saveAll(VideoCard::class.getPartsFromJson().filterIsInstance<VideoCard>())
    }

}
