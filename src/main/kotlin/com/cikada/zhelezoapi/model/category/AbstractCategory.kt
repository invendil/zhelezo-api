package com.cikada.zhelezoapi.model.category

import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class AbstractCategory(
    @Column(unique = true, nullable = false)
    var name: String? = null
)