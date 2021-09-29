package by.shkrub

import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {
    @Test
    fun testRoot() {
        withTestApplication({ bindRoutes() }) {
            handleRequest(HttpMethod.Get, "/helloWorld").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("Hello world!!!", response.content)
            }
        }
    }
}