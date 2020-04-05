package lt.codedicted.egzaminai.mobile.backend.controller.maturity

import lt.codedicted.egzaminai.core.model.maturity.MaturityExam
import lt.codedicted.egzaminai.core.service.maturity.MaturityExamService
import org.springframework.web.bind.annotation.*

@RestController
class MaturityExamController(
   private val service: MaturityExamService
) {

    @GetMapping("/exams")
    fun getExams(): Collection<MaturityExam> {
        return service.getExams()
    }

}
