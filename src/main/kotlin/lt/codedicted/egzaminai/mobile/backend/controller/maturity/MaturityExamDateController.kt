package lt.codedicted.egzaminai.mobile.backend.controller.maturity

import lt.codedicted.egzaminai.core.model.maturity.MaturityExamDate
import lt.codedicted.egzaminai.core.service.maturity.MaturityExamDateService
import org.springframework.web.bind.annotation.*

@RestController
class MaturityExamDateController(private val service: MaturityExamDateService
) {

    @GetMapping("/dates")
    fun getDates(): Collection<MaturityExamDate> {
        return service.getDates()
    }

}
