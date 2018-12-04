package com.atthapon.errormapperlib

import kotlin.Exception

class Error(var type: String, var code: String) : Exception() {
    var params: String? = null
    var causeCode: String? = null
    override var message: String? = null
    override var cause: Exception? = null

    fun build(message: String?, params: String?, cause: Exception?, causeCode: String?): Error {
        return this.apply {
            this.message = message
            this.params = params
            this.cause = cause
            this.causeCode = causeCode
        }
    }
}