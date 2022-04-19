package com.thebluekernel.plugins

import io.ktor.application.*
import org.koin.ktor.ext.Koin

/**
 * Created by Ahmed Ibrahim on 19,April,2022
 */

fun Application.configureDI() {
    install(Koin) {
        /// TODO: 19/04/2022 Declare app modules here
        modules(listOf())
    }
}