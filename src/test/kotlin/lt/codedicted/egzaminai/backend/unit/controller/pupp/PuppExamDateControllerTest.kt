package lt.codedicted.egzaminai.backend.unit.controller.pupp

import io.mockk.*
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import lt.codedicted.egzaminai.mobile.backend.controller.pupp.PuppExamDateController
import lt.codedicted.egzaminai.core.model.pupp.PuppExamDate
import lt.codedicted.egzaminai.core.model.types.PuppExamName
import lt.codedicted.egzaminai.core.service.pupp.PuppExamDateService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import java.time.LocalDateTime

@ExtendWith(MockKExtension::class)
class PuppExamDateControllerTest {

    @MockK
    private lateinit var service: PuppExamDateService

    private lateinit var controller: PuppExamDateController

    @BeforeEach
    fun setUp() {
        controller = PuppExamDateController(service)
    }

    @Test
    fun `Retrieves dates`() {
        val expectedDates = listOf(PuppExamDate("id", PuppExamName.LITHUANIAN_LANGUAGE_WRITING, "", LocalDateTime.now()))
        every { service.getDates() } returns expectedDates

        val actualDates = controller.getDates()

        assertEquals(expectedDates, actualDates)
    }

}
