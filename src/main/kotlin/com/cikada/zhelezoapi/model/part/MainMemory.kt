package com.cikada.zhelezoapi.model.part

import com.cikada.zhelezoapi.model.category.FormFactor
import com.cikada.zhelezoapi.model.category.MainMemoryType
import javax.persistence.CascadeType.PERSIST
import javax.persistence.CascadeType.REFRESH
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType.LAZY
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id
import javax.persistence.Inheritance
import javax.persistence.InheritanceType
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