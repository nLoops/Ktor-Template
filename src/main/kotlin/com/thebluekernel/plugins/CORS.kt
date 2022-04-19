package com.thebluekernel.plugins

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*

/**
 * Created by Ahmed Ibrahim on 19,April,2022
 */
fun Application.configureCORS() {
    install(CORS) {
        method(HttpMethod.Get)
        method(HttpMethod.Post)
        method(HttpMethod.Put)
        method(HttpMethod.Delete)
        header(HttpHeaders.Authorization)
        anyHost()
    }
}