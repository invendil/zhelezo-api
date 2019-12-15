package com.cikada.zhelezoapi.repository

import com.cikada.zhelezoapi.model.category.MainMemoryType
import com.cikada.zhelezoapi.model.category.Socket
import com.cikada.zhelezoapi.model.part.Case
import com.cikada.zhelezoapi.model.part.VideoCard
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MainMemoryTypeRepository : CrudRepository<MainMemoryType, Long>