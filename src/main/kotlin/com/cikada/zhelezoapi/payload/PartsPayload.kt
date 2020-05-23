package com.cikada.zhelezoapi.payload

import com.cikada.zhelezoapi.model.part.Case
import com.cikada.zhelezoapi.model.part.MainMemory
import com.cikada.zhelezoapi.model.part.Motherboard
import com.cikada.zhelezoapi.model.part.PowerSupply
import com.cikada.zhelezoapi.model.part.Processor
import com.cikada.zhelezoapi.model.part.Storage
import com.cikada.zhelezoapi.model.part.VideoCard

class PartsPayload {
    var cases: List<Case>? = null
    var mainMemories: List<MainMemory>? = null
    var motherboards: List<Motherboard>? = null
    var powerSuits: List<PowerSupply>? = null
    var processors: List<Processor>? = null
    var storages: List<Storage>? = null
    var videoCards: List<VideoCard>? = null
}