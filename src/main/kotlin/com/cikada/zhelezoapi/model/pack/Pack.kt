package com.cikada.zhelezoapi.model.pack

import com.cikada.zhelezoapi.model.category.AbstractCategory
import com.cikada.zhelezoapi.model.part.Case
import com.cikada.zhelezoapi.model.part.Motherboard
import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY

@Entity
@Table(name = "packs")
data class Pack(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(unique = true, nullable = false)
    val id: Long? = null,

    @OneToMany(mappedBy = "formFactor")
    var cases: Collection<Case>? = null,

    @OneToMany(mappedBy = "formFactor")
    var motherboards: Collection<Motherboard>? = null
) : AbstractCategory()