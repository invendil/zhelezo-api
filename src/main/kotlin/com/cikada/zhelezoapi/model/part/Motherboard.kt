package com.cikada.zhelezoapi.model.part

import com.cikada.zhelezoapi.model.category.FormFactor
import com.cikada.zhelezoapi.model.category.MainMemoryType
import com.cikada.zhelezoapi.model.category.Socket
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id
import javax.persistence.Inheritance
import javax.persistence.InheritanceType
import javax.persistence.InheritanceType.JOINED
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
data class Motherboard(
    @ManyToOne
    @JoinColumn(name = "form_factor_id", nullable = false)
    var formFactor: FormFactor? = null,

    @ManyToOne
    @JoinColumn(name = "socket_id", nullable = false)
    var socket: Socket? = null,

    @ManyToOne
    @JoinColumn(name = "main_memory_type_id", nullable = false)
    var mainMemoryType: MainMemoryType? = null
) : AbstractPartEntity()