package lt.codedicted.egzaminai.backend.unit.controller.pupp

import io.mockk.*
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import lt.codedicted.egzaminai.mobile.backend.controller.pupp.PuppProgramController
import lt.codedicted.egzaminai.core.model.pupp.PuppProgram
import lt.codedicted.egzaminai.core.service.pupp.PuppProgramService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class PuppProgramControllerTest {

    @MockK
    private lateinit var service: PuppProgramService

    private lateinit var controller: PuppProgramController

    @BeforeEach
    fun setUp() {
        controller = PuppProgramController(service)
    }

    @Test
    fun `Retrieves programs`() {
        val expectedPrograms = listOf(PuppProgram("id", "user", "url"))
        every { service.getPrograms() } returns expectedPrograms

        val actualPrograms = controller.getPrograms()

        assertEquals(expectedPrograms, actualPrograms)
    }

}
