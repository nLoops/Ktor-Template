package com.thebluekernel.plugins

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.serialization.*
import kotlinx.serialization.json.Json

/**
 * Created by Ahmed Ibrahim on 19,April,2022
 */

fun Application.configureContentNegotiation() {
    install(ContentNegotiation) {
        json(
            json = Json {
                prettyPrint = true
            },
            contentType = ContentType.Application.Json
        )
    }
}