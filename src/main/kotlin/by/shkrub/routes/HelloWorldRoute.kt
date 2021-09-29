package by.shkrub.routes

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Routing.helloWorld() {
    route("helloWorld") {
        get {
            call.respondText("Hello world!!!")
        }
    }
}