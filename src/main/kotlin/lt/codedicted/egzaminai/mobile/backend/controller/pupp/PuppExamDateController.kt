package lt.codedicted.egzaminai.mobile.backend.controller.pupp

import lt.codedicted.egzaminai.core.model.pupp.PuppExamDate
import lt.codedicted.egzaminai.core.service.pupp.PuppExamDateService
import org.springframework.web.bind.annotation.*


@RestController
class PuppExamDateController(private val service: PuppExamDateService
) {

    @GetMapping("/pupp-dates")
    fun getDates(): Collection<PuppExamDate> {
        return service.getDates()
    }

}
