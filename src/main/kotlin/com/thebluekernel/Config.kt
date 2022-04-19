package com.thebluekernel

import io.ktor.application.*
import io.ktor.config.*

/**
 * Created by Ahmed Ibrahim on 19,April,2022
 */

@Suppress("PropertyName")
object Config {
    private var applicationConfig: ApplicationConfig? = null

    fun init(application: ApplicationConfig) {
        applicationConfig = application
    }

    private fun getStringEnvVariable(propertyName: String): String? {
        return applicationConfig?.property(propertyName)?.getString()
    }

    private fun getListOfEnvVariable(propertyName: String): List<String>? {
        return applicationConfig?.property(propertyName)?.getList()
    }

}

fun Application.initConfig() {
    Config.init(environment.config)
}