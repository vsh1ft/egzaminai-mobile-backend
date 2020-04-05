package lt.codedicted.egzaminai.mobile.backend.controller

import lt.codedicted.egzaminai.core.repository.DatabaseVersionRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DatabaseVersionController(
    private val repository: DatabaseVersionRepository
) {

    @GetMapping("/database-version")
    fun getDatabaseVersion() = repository.findAll().first().id

}
