package com.cikada.zhelezoapi.payload

import com.cikada.zhelezoapi.model.part.*

class PartsPayload {
    var cases: List<Case>? = null
    var mainMemories: List<MainMemory>? = null
    var motherboards: List<Motherboard>? = null
    var powerSuits: List<PowerSupply>? = null
    var processors: List<Processor>? = null
    var storages: List<Storage>? = null
    var videoCards: List<VideoCard>? = null
}