package com.thebluekernel.plugins

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.request.*
import org.slf4j.event.Level

/**
 * Created by Ahmed Ibrahim on 19,April,2022
 */

fun Application.configureCallLogger() {
    install(CallLogging) {
        level = Level.INFO
        format { call ->
            val status = call.response.status()
            val httpMethod = call.request.httpMethod.value
            val userAgent = call.request.headers["User-Agent"]
            val endpoint = call.request.path()
            "Endpoint: [ $endpoint ] Status: $status, HTTP method: $httpMethod, User agent: $userAgent"
        }
    }
}