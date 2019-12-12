package com.cikada.zhelezoapi.model

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class RAMemory(
    @Id @GeneratedValue
    val id: Long? = null
) : AbstractPartEnity()
