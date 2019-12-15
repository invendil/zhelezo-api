package com.cikada.zhelezoapi.model.category

import com.cikada.zhelezoapi.model.part.MainMemory
import com.cikada.zhelezoapi.model.part.Motherboard
import com.cikada.zhelezoapi.model.part.Processor
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToMany
import javax.persistence.Table

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
