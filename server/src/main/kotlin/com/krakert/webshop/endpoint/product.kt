package com.krakert.webshop.endpoint

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.product() {
    routing {
        route("/products") {
            get("/all") {
                call.respondText("Hello from 'module1'!")
            }
        }
    }
}