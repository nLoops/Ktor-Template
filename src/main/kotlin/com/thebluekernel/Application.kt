package com.thebluekernel

import com.thebluekernel.plugins.*
import io.ktor.application.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    initConfig()
    configureDI()
    configureCORS()
    configureStatusPages()
    configureContentNegotiation()
    configureCallLogger()
    configureRouting()
}

const val API_VERSION = "/api/v1"
