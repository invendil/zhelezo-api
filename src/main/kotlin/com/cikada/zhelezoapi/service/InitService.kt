package com.cikada.zhelezoapi.service

import com.cikada.zhelezoapi.model.part.*
import com.cikada.zhelezoapi.repository.FormFactorRepository
import com.cikada.zhelezoapi.repository.MainMemoryTypeRepository
import com.cikada.zhelezoapi.repository.RoleRepository
import com.cikada.zhelezoapi.repository.SocketRepository
import com.cikada.zhelezoapi.util.*
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
    @Autowired
    lateinit var roleRepository: RoleRepository

    @Throws(IOException::class)
    fun initParts() {
        roleRepository.saveAll(roles)
        sockets = socketRepository.saveAll(sockets).toList()
        formFactors = formFactorRepository.saveAll(formFactors).toList()
        mainMemoryTypes = mainMemoryTypeRepository.saveAll(mainMemoryTypes).toList()
        caseRepository.saveAll(Case::class.getPartsFromJson().filterIsInstance<Case>())
        mainMemoryRepository.saveAll(MainMemory::class.getPartsFromJson().filterIsInstance<MainMemory>())
        motherboardRepository.saveAll(Motherboard::class.getPartsFromJson().filterIsInstance<Motherboard>())
        powerSuitRepository.saveAll(PowerSupply::class.getPartsFromJson().filterIsInstance<PowerSupply>())
        processorRepository.saveAll(Processor::class.getPartsFromJson().filterIsInstance<Processor>())
        storageRepository.saveAll(Storage::class.getPartsFromJson().filterIsInstance<Storage>())
        videoCardRepository.saveAll(VideoCard::class.getPartsFromJson().filterIsInstance<VideoCard>())
    }

}
