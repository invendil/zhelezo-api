package com.cikada.zhelezoapi.model.part

import com.cikada.zhelezoapi.model.category.FormFactor
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "pc_case")
data class Case(
    @ManyToOne
    @JoinColumn(name = "form_factor_id", nullable = false)
    var formFactor: FormFactor? = null
) : AbstractPartEntity()
