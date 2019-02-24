package com.atthapon.homunculierror


class HomunculiError(var type: String, override var code: String) : BaseError(code) {
    var params: String? = null
    var causeCode: String? = null

    fun build(message: String?, params: String?, cause: Throwable?, causeCode: String?): HomunculiError {
        return this.apply {
            this.message = message
            this.params = params
            this.cause = cause
            this.causeCode = causeCode
        }
    }
}