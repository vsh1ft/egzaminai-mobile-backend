package lt.codedicted.egzaminai.mobile.backend.controller.maturity

import org.springframework.web.bind.annotation.*
import lt.codedicted.egzaminai.core.model.maturity.MaturityCourseCredit
import lt.codedicted.egzaminai.core.service.maturity.MaturityCourseCreditService

@RestController
class MaturityCourseCreditController(private val service: MaturityCourseCreditService) {

    @GetMapping("/credits")
    fun getCredits(): Collection<MaturityCourseCredit> {
        return service.getCredits()
    }

}
