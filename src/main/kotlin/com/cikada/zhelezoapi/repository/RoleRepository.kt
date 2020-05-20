package com.cikada.zhelezoapi.repository

import com.cikada.zhelezoapi.model.auth.Role
import org.springframework.data.repository.query.Param
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository : JpaRepository<Role, Long> {

    fun findByName(@Param("name") name: String): Role
}