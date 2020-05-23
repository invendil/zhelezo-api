package com.cikada.zhelezoapi.model.part

import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "power_suit")
data class PowerSupply(
    override var power: Int? = null
) : AbstractPartEntity()
