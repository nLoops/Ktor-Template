package com.thebluekernel.plugins

import com.thebluekernel.route.homeRoute
import io.ktor.application.*
import io.ktor.routing.*

/**
 * Created by Ahmed Ibrahim on 19,April,2022
 */
fun Application.configureRouting() {
    routing {
        // TODO: 19/04/2022 Define your app routers here
        homeRoute()
    }
}