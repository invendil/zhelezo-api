package com.cikada.zhelezoapi.controller

import com.cikada.zhelezoapi.model.part.MainMemory
import com.cikada.zhelezoapi.payload.PartsPayload
import com.cikada.zhelezoapi.repository.MainMemoryRepository
import com.cikada.zhelezoapi.util.setAdditionalProperties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/parts")
class PartController {

    @Autowired
    lateinit var mainMemoryRepository: MainMemoryRepository

    @GetMapping("/find")
    @ResponseBody
    fun getMainMemories(): PartsPayload = run {
        val response = PartsPayload().apply {
            mainMemories = mainMemoryRepository.findAll().toList()
                .run {
                    forEach { it.mainMemoryType = null }
                    this
                }
        }
        response
    }

    @PostMapping("/save")
    fun saveMainMemory(@RequestBody mainMemories: List<MainMemory>) {
        mainMemories.forEach {
            it.setAdditionalProperties()
        }
        mainMemoryRepository.saveAll(mainMemories)

        return
    }
//
//    @PostMapping("/find")
//    @ResponseBody
//    fun startGameSession(@RequestBody gameSessionPayload: GameSessionPayload): Collection<QuestionPayload>? =
//            gameSessionService.startGame(gameSessionPayload)
//
//    @PostMapping("ask")
//    @ResponseBody
//    fun verifyAnswer(@RequestBody gameSessionPayload: GameSessionPayload): Boolean =
//            gameSessionService.isAnswerRight(gameSessionPayload)
//
//    @GetMapping("records/{category}")
//    @ResponseBody
//    fun getRecordsByCategory(@PathVariable("category") categoryName: String): Collection<RecordPayload> =
//            recordService.getByCategoryName(categoryName) ?: listOf()
//
//    companion object {
//        private val logger = LoggerFactory.getLogger(PartController::class.java)
//    }

}
