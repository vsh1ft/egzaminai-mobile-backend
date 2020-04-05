package lt.codedicted.egzaminai.mobile.backend.controller.maturity

import lt.codedicted.egzaminai.core.model.maturity.MaturityProgram
import lt.codedicted.egzaminai.core.service.maturity.MaturityProgramService
import org.springframework.web.bind.annotation.*

@RestController
class MaturityProgramController(private val service: MaturityProgramService) {

    @GetMapping("/programs")
    fun getPrograms(): Collection<MaturityProgram> {
        return service.getPrograms()
    }

}
