package com.cikada.zhelezoapi.controller

import com.cikada.zhelezoapi.model.dto.BuildResponse
import com.cikada.zhelezoapi.model.dto.ErrorResponse
import com.cikada.zhelezoapi.model.dto.PartResponse
import com.cikada.zhelezoapi.service.PartService
import com.cikada.zhelezoapi.util.objectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

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
    fun checkBuild(@RequestBody build: BuildResponse): List<ErrorResponse> {
//        logger.info(objectMapper.writeValueAsString(build))

        return partService.checkBuild(build)
    }

    @GetMapping("/check")
    @ResponseBody
    fun test() {
        logger.info("test")

        partService.checkBuild(objectMapper.readValue<BuildResponse>(testVal))
    }


    companion object {
        private val logger = LoggerFactory.getLogger(PartController::class.java)
        val testVal = "{\n" +
            "  \"partList\": [\n" +
            "    {\n" +
            "      \"name\": \"Intel Core i5-9400F\",\n" +
            "      \"description\": \"Coffee Lake, LGA1151 v2, 6 ядер, частота 4.1/2.9 ГГц, кэш 9 МБ, техпроцесс 14 нм, TDP 65W\",\n" +
            "      \"imgUrl\": \"//content2.onliner.by/catalog/device/header/fb078eb7abffe5cda1b67caae6a24969.jpeg\",\n" +
            "      \"price\": 318.04,\n" +
            "      \"typeName\": \"processor\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"Zalman S3\",\n" +
            "      \"description\": \"Midi Tower, блок питания отсутствует, для плат ATX/micro-ATX/mini-ITX, 1 вентилятор, 2xUSB 2.0, 1xUSB 3.0, цвет черный\",\n" +
            "      \"imgUrl\": \"//content2.onliner.by/catalog/device/header/7cb268c39087a5612ad0de37a824dac9.jpeg\",\n" +
            "      \"price\": 69.84,\n" +
            "      \"typeName\": \"case\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"Crucial Ballistix Sport LT 2x8GB DDR4 PC4-25600 BLS2K8G4D32AESBK\",\n" +
            "      \"description\": \"2 модуля, частота 3200 МГц, CL 16T, тайминги 16-18-18, напряжение 1.35 В\",\n" +
            "      \"imgUrl\": \"//content2.onliner.by/catalog/device/header/bdb4e1ba3658dd13df344a1cc1d1c22e.jpeg\",\n" +
            "      \"price\": 182.63,\n" +
            "      \"typeName\": \"mainMemory\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"MSI B450 Gaming Plus Max\",\n" +
            "      \"description\": \"ATX, сокет AMD AM4, чипсет AMD B450, память 4xDDR4, слоты: 2xPCIe x16, 4xPCIe x1\",\n" +
            "      \"imgUrl\": \"//content2.onliner.by/catalog/device/header/dbecbef96c20a7fd2b14c4145761b9cf.jpeg\",\n" +
            "      \"price\": 223.16,\n" +
            "      \"typeName\": \"motherboard\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"name\": \"Chieftec Proton BDF-600S\",\n" +
            "      \"description\": \"активная PFC, КПД 85%, бронзовый сертификат, вентилятор 1x120 мм, 12V 50 А\",\n" +
            "      \"imgUrl\": \"//content2.onliner.by/catalog/device/header/5e93108fbe31dd3f262aa173ac859c39.jpeg\",\n" +
            "      \"price\": 115.56,\n" +
            "      \"typeName\": \"powerSuit\"\n" +
            "    }\n" +
            "  ]\n" +
            "}"
    }
}
