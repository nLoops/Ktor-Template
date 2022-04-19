package com.thebluekernel.model.response

import kotlinx.serialization.Serializable

/**
 * Created by Ahmed Ibrahim on 19,April,2022
 */
@Serializable
data class FailureResponse(override val status: State, override val message: String) : Response