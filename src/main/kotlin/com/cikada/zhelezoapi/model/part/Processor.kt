package com.cikada.zhelezoapi.model.part

import com.cikada.zhelezoapi.model.category.Socket
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
data class Processor(
    @ManyToOne
    @JoinColumn(name = "socket_id", nullable = false)
    var socket: Socket? = null
) : AbstractPartEntity()