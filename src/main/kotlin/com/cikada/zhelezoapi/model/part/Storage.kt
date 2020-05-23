package com.cikada.zhelezoapi.model.part

import javax.persistence.Entity

@Entity
data class Storage(
    var memory: Int? = null
) : AbstractPartEntity()
