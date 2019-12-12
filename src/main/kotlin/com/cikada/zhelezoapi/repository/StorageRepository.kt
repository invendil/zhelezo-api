package com.cikada.zhelezoapi.repository

import com.cikada.zhelezoapi.model.Storage
import org.springframework.data.repository.CrudRepository

interface StorageRepository : CrudRepository<Storage, Long>
