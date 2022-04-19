package com.thebluekernel.route

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

/**
 * Created by Ahmed Ibrahim on 19,April,2022
 */

fun Route.homeRoute() {
    get("/") {
        call.respond("Hello Ktor!")
    }
}