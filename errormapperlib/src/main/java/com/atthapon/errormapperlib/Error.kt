package com.atthapon.errormapperlib

import kotlin.Exception

class Error(type: String, code: String) : BaseError(type, code) {
    var params: String? = null
    var causeCode: String? = null

    fun build(message: String?, params: String?, cause: Exception?, causeCode: String?): Error {
        return this.apply {
            this.message = message
            this.params = params
            this.cause = cause
            this.causeCode = causeCode
        }
    }
}