package com.cikada.zhelezoapi.model

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Inheritance
import javax.persistence.InheritanceType.SINGLE_TABLE
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class AbstractPartEnity(
    @Column(unique = true)
    var name: String? = null,
    var description: String? = null,
    var imgUrl: String? = null,
    var price: BigDecimal? = null
)