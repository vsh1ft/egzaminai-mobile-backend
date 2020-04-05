package lt.codedicted.egzaminai.mobile.backend.controller.pupp

import lt.codedicted.egzaminai.core.model.pupp.PuppExam
import lt.codedicted.egzaminai.core.service.pupp.PuppExamService
import org.springframework.web.bind.annotation.*

@RestController
class PuppExamController(private val service: PuppExamService
) {

    @GetMapping("/pupp-exams")
    fun getExams(): Collection<PuppExam> {
        return service.getExams()
    }

}
