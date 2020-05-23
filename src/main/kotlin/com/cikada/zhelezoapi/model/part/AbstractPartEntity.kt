package com.cikada.zhelezoapi.model.part

import jdk.jfr.Description
import java.math.BigDecimal
import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY

@MappedSuperclass
open class AbstractPartEntity(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    val id: Long? = null,

    @Column(unique = true, nullable = false)
    var name: String? = null,

    @Column(columnDefinition="TEXT")
    var description: String? = null,

    var imgUrl: String? = null,

    var price: BigDecimal? = null,

    open var power: Int? = null
)