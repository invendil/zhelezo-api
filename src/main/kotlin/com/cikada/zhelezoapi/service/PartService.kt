package com.cikada.zhelezoapi.service

import com.cikada.zhelezoapi.payload.BuildPayload
import org.springframework.stereotype.Service

@Service
class PartService : BasePartService() {

    fun saveBuildFull(buildFull: BuildPayload) {
        if(buildFull.case != null) caseRepository.save(buildFull.case)
        if(buildFull.mainMemory != null) mainMemoryRepository.save(buildFull.mainMemory)
        if(buildFull.motherboard != null) motherboardRepository.save(buildFull.motherboard)
        if(buildFull.powerSuit != null) powerSuitRepository.save(buildFull.powerSuit)
        if(buildFull.processor != null) processorRepository.save(buildFull.processor)
        if(buildFull.storage != null) storageRepository.save(buildFull.storage)
        if(buildFull.videoCard != null) videoCardRepository.save(buildFull.videoCard)
    }
}