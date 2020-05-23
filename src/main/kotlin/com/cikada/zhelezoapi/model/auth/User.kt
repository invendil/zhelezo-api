package com.cikada.zhelezoapi.model.auth

import javax.persistence.*
import javax.persistence.FetchType.EAGER

@Entity
@Table(name = "users")
data class User(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = 0,

        @Column
        var username: String? = null,

        @Column(name = "first_name")
        var firstName: String? = null,

        @Column(name = "last_name")
        var lastName: String? = null,

        @Column
        var email: String? = null,

        @Column
        var password: String? = null,

        @Column
        var enabled: Boolean = false,

        @ManyToMany(fetch = EAGER)
        @JoinTable(
                name = "users_roles",
                joinColumns = [JoinColumn(name = "user_id", referencedColumnName = "id")],
                inverseJoinColumns = [JoinColumn(name = "role_id", referencedColumnName = "id")]
        )
        var roles: Collection<Role>? = null
)