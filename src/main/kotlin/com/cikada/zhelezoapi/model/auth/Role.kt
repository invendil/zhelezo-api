package com.cikada.zhelezoapi.model.auth

import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY

@Entity
@Table(name = "roles")
data class Role(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    val id: Long? = null,

    @Column
    val name: String? = null
)

enum class Roles(name: String) {
    ADMIN("ADMIN"),
    USER("USER")
}