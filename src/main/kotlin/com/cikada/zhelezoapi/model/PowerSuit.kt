package com.cikada.zhelezoapi.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class PowerSuit(
    @Id @GeneratedValue
    val id: Long? = null
) : AbstractPartEnity()
