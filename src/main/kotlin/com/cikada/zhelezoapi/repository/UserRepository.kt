package com.cikada.zhelezoapi.repository

import com.cikada.zhelezoapi.model.auth.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import java.util.*
import javax.transaction.Transactional

interface UserRepository : JpaRepository<User, Long> {
    fun existsByUsername(@Param("username") username: String): Boolean

    fun findByUsername(@Param("username") username: String): Optional<User>

    fun findByEmail(@Param("email") email: String): Optional<User>

    @Transactional
    fun deleteByUsername(@Param("username") username: String)
}