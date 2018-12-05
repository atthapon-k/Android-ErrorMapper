package com.atthapon.errormapperlib

open class BaseError(open var code: String) : Exception() {
    override var cause: Exception? = null
    override var message: String? = null
}