package com.cikada.zhelezoapi.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/component")
class PartController {


//    @PostMapping("/save")
//    @ResponseBody
//    fun save(@RequestBody body: Case): Case = AbstractPartEntity().save()
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
