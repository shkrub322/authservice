package by.shkrub

import by.shkrub.routes.helloWorld
import io.ktor.application.*
import io.ktor.routing.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.main() {
    bindRoutes()
}

fun Application.bindRoutes() {
    routing {
        helloWorld()
    }
}
