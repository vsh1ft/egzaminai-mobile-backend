package lt.codedicted.egzaminai.backend.unit.controller.maturity

import io.mockk.*
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import lt.codedicted.egzaminai.mobile.backend.controller.maturity.MaturityProgramController
import lt.codedicted.egzaminai.core.model.maturity.MaturityProgram
import lt.codedicted.egzaminai.core.model.types.Subject
import lt.codedicted.egzaminai.core.service.maturity.MaturityProgramService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class MaturityProgramControllerTest {


    @MockK
    private lateinit var service: MaturityProgramService

    private lateinit var controller: MaturityProgramController

    @BeforeEach
    fun setUp() {
        controller = MaturityProgramController(service)
    }

    @Test
    fun `Retrieves programs`() {
        val expectedPrograms = listOf(MaturityProgram("", "user", Subject.LITHUANIAN_LANGUAGE, "url"))
        every { service.getPrograms() } returns expectedPrograms

        val actualPrograms = controller.getPrograms()

        assertEquals(expectedPrograms, actualPrograms)
    }

}
