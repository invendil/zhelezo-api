package com.cikada.zhelezoapi.model.part

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id

@Entity
data class Storage(
    var memory: Int? = null
) : AbstractPartEntity()
