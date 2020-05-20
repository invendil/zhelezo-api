package com.cikada.zhelezoapi.model.dto

import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable
import javax.validation.constraints.NotEmpty

class LoginUser : Serializable {

    @JsonProperty
    @NotEmpty
    var username: String? = null

    @JsonProperty
    @NotEmpty
    var password: String? = null

    companion object {
        private const val serialVersionUID = -1764970284520387975L
    }
}