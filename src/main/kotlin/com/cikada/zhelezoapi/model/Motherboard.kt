package com.cikada.zhelezoapi.model

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class Motherboard(
    @Id @GeneratedValue
    val id: Long? = null
) : AbstractPartEnity() {
    @ManyToOne
    lateinit var formFactor: FormFactor
    @ManyToOne
    lateinit var socket: Socket
}
