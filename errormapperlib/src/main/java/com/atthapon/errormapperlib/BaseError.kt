package com.atthapon.errormapperlib

open class BaseError(var type: String, var code: String) : Exception() {
    override var cause: Exception? = null
    override var message: String? = null
}