package com.cikada.zhelezoapi.repository

import com.cikada.zhelezoapi.model.part.Case
import com.cikada.zhelezoapi.model.part.VideoCard
import org.springframework.stereotype.Repository

@Repository
interface CaseRepository : AbstractRepository<Case>