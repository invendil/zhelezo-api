package com.cikada.zhelezoapi.controller

import com.cikada.zhelezoapi.model.response.BuildResponse
import com.cikada.zhelezoapi.model.response.PartResponse
import com.cikada.zhelezoapi.service.PartService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/parts")
class PartController {

    @Autowired
    private lateinit var partService: PartService

    @GetMapping("/find/{name}")
    @ResponseBody
    fun getPart(
        @PathVariable("name") partName: String
    ): List<PartResponse> = partService.findPartsByPartType(partName)

    @PostMapping("/check")
    @ResponseBody
    fun checkBuild(@RequestBody build: BuildResponse) = partService.checkBuild(build)
}
