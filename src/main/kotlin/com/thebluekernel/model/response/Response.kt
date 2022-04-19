package com.thebluekernel.model.response

/**
 * Created by Ahmed Ibrahim on 19,April,2022
 */
interface Response {
    val status: State
    val message: String
}

/**
 * HTTP Response Status. Used for evaluation of [HttpResponse] type.
 */
enum class State {
    SUCCESS, NOT_FOUND, FAILED, UNAUTHORIZED
}