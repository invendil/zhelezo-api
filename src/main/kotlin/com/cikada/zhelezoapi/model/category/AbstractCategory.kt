package com.cikada.zhelezoapi.model.category

import jdk.jfr.Description
import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.DiscriminatorColumn
import javax.persistence.DiscriminatorType
import javax.persistence.DiscriminatorType.STRING
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class AbstractCategory(
    @Column(unique = true, nullable = false)
    var name: String? = null
)