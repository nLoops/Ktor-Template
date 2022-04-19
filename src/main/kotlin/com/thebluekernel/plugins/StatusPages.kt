package com.thebluekernel.plugins

import com.thebluekernel.exceptions.FailureMessages
import com.thebluekernel.model.response.FailureResponse
import com.thebluekernel.model.response.State
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.response.*

/**
 * Created by Ahmed Ibrahim on 19,April,2022
 */

fun Application.configureStatusPages() {
    install(StatusPages) {
        exception<BadRequestException> {
            call.respond(HttpStatusCode.BadRequest, FailureResponse(State.FAILED, it.message ?: "Bad Request"))
        }

        status(HttpStatusCode.InternalServerError) {
            call.respond(it, FailureResponse(State.FAILED, FailureMessages.MESSAGE_FAILED))
        }

        status(HttpStatusCode.Unauthorized) {
            call.respond(it, FailureResponse(State.UNAUTHORIZED, FailureMessages.MESSAGE_ACCESS_DENIED))
        }
    }
}