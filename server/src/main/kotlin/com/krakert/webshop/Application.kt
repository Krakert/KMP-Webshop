package com.krakert.webshop

import Greeting
import SERVER_PORT
import com.krakert.webshop.endpoint.product
import com.krakert.webshop.endpoint.user
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = SERVER_PORT, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    main()
    user()
    product()
}


fun Application.main() {
    routing {
        get("/") {
            call.respondText("Ktor: ${Greeting().greet()}")
        }
    }
}