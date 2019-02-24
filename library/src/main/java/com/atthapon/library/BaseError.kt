package com.atthapon.library

open class BaseError(open var code: String) : Exception() {
    override var cause: Throwable? = null
    override var message: String? = null
}