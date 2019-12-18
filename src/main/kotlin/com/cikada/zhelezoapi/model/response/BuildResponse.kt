package com.cikada.zhelezoapi.model.response

import com.cikada.zhelezoapi.model.part.Case
import com.cikada.zhelezoapi.model.part.MainMemory
import com.cikada.zhelezoapi.model.part.Motherboard
import com.cikada.zhelezoapi.model.part.PowerSuit
import com.cikada.zhelezoapi.model.part.Processor
import com.cikada.zhelezoapi.model.part.Storage
import com.cikada.zhelezoapi.model.part.VideoCard

class BuildResponse {
    var partList: List<PartResponse>? = null
}