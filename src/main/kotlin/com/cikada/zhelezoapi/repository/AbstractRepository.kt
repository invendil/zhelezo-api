package com.cikada.zhelezoapi.repository

import com.cikada.zhelezoapi.model.part.AbstractPartEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.NoRepositoryBean
import org.springframework.stereotype.Repository
import java.util.Optional

@NoRepositoryBean
interface AbstractRepository<T : AbstractPartEntity> : CrudRepository<T, Long> {
    fun findByName(name: String): Optional<T>
}
