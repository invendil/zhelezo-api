package com.cikada.zhelezoapi.model.part

import com.cikada.zhelezoapi.model.category.MainMemoryType
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "main_memory")
data class MainMemory(
    @ManyToOne
    @JoinColumn(name = "main_memory_type_id", nullable = false)
    var mainMemoryType: MainMemoryType? = null
) : AbstractPartEntity()