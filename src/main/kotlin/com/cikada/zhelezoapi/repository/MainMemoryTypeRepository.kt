package com.cikada.zhelezoapi.repository

import com.cikada.zhelezoapi.model.category.MainMemoryType
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MainMemoryTypeRepository : CrudRepository<MainMemoryType, Long>