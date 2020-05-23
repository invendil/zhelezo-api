package com.cikada.zhelezoapi.model.category

import com.cikada.zhelezoapi.model.part.Case
import com.cikada.zhelezoapi.model.part.Motherboard
import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY

@Entity
@Table(name = "form_factor")
data class FormFactor(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    val id: Long? = null,

    @OneToMany(mappedBy = "formFactor")
    var cases: Collection<Case>? = null,

    @OneToMany(mappedBy = "formFactor")
    var motherboards: Collection<Motherboard>? = null
) : AbstractCategory()
