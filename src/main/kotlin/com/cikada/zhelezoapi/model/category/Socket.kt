package com.cikada.zhelezoapi.model.category

import com.cikada.zhelezoapi.model.part.Motherboard
import com.cikada.zhelezoapi.model.part.Processor
import javax.persistence.CascadeType.PERSIST
import javax.persistence.CascadeType.REFRESH
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.FetchType.EAGER
import javax.persistence.FetchType.LAZY
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToMany

@Entity
data class Socket(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    val id: Long? = null,

    @OneToMany(targetEntity = Motherboard::class, mappedBy = "socket")
    var motherboards: Collection<Motherboard>? = null,

    @OneToMany(targetEntity = Processor::class, mappedBy = "socket")
    var processors: Collection<Processor>? = null
) : AbstractCategory()
