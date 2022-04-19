package com.thebluekernel.exceptions

/**
 * Created by Ahmed Ibrahim on 19,April,2022
 */
class BadRequestException(override val message: String) : Exception(message)

class UnauthorizedActivityException(override val message: String) : Exception(message)