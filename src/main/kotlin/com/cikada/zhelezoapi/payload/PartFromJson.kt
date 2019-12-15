package com.cikada.zhelezoapi.payload

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class PartFromJson {
    @get:JsonProperty("full_name")
    val fullName: String? = null
    val images: Images? = null
    val description: String? = null
    val prices: Prices? = null
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Images {
    val header: String? = null
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Prices {
    @get:JsonProperty("price_min")
    val priceMin: PriceMin? = null
}

@JsonIgnoreProperties(ignoreUnknown = true)
class PriceMin {
    val amount: String? = null
}

