package lt.codedicted.egzaminai.mobile.backend.controller.pupp

import lt.codedicted.egzaminai.core.model.pupp.PuppProgram
import lt.codedicted.egzaminai.core.service.pupp.PuppProgramService
import org.springframework.web.bind.annotation.*

@RestController
class PuppProgramController(private val service: PuppProgramService
) {

    @GetMapping("/pupp-programs")
    fun getPrograms(): Collection<PuppProgram> {
        return service.getPrograms()
    }

}
