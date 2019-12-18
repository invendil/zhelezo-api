package com.cikada.zhelezoapi.model.response

import java.math.BigDecimal

class PartResponse(
    var name: String? = null,
    var description: String? = null,
    var imgUrl: String? = null,
    var price: BigDecimal? = null,
    var typeName: String? = null
)