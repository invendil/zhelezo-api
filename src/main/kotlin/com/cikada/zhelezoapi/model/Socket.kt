package com.cikada.zhelezoapi.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Socket(
    @Id @GeneratedValue
    val id: Long? = null,
    @Column(unique = true)
    var name: String? = null
)
