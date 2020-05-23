package com.cikada.zhelezoapi.repository

import com.cikada.zhelezoapi.model.category.FormFactor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface FormFactorRepository : CrudRepository<FormFactor, Long>