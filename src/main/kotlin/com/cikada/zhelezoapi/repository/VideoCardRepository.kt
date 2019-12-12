package com.cikada.zhelezoapi.repository

import com.cikada.zhelezoapi.model.VideoCard
import org.springframework.data.repository.CrudRepository

interface VideoCardRepository : CrudRepository<VideoCard, Long>
