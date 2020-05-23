package com.cikada.zhelezoapi.model.category

import com.cikada.zhelezoapi.model.part.MainMemory
import com.cikada.zhelezoapi.model.part.Motherboard
import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY

@Entity
@Table(name = "main_memory_type")
data class MainMemoryType(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    val id: Long? = null,

    @OneToMany(mappedBy = "mainMemoryType")
    var motherboards: Collection<Motherboard>? = null,

    @OneToMany(mappedBy = "mainMemoryType")
    var mainMemories: Collection<MainMemory>? = null
) : AbstractCategory()
