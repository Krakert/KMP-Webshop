package com.krakert.webshop.endpoint

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.user() {
    routing {
        route("/user") {
            get("/data") {
                call.respondText("Hello from 'module1'!")
            }
        }
    }
}