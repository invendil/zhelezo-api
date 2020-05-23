package com.cikada.zhelezoapi.repository

import com.cikada.zhelezoapi.model.category.Socket
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SocketRepository : CrudRepository<Socket, Long>