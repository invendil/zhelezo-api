package com.cikada.zhelezoapi.model.category

import com.cikada.zhelezoapi.model.part.Motherboard
import com.cikada.zhelezoapi.model.part.Processor
import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY

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
