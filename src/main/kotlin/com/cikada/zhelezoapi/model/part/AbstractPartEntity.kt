package com.cikada.zhelezoapi.model.part

import jdk.jfr.Description
import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.DiscriminatorColumn
import javax.persistence.DiscriminatorType
import javax.persistence.DiscriminatorType.STRING
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class AbstractPartEntity(
    @Column(unique = true, nullable = false)
    var name: String? = null,
    @Column(columnDefinition="TEXT")
    var description: String? = null,
    var imgUrl: String? = null,
    var price: BigDecimal? = null
)