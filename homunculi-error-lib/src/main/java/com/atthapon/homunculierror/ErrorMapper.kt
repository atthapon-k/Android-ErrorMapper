package com.atthapon.homunculierror

interface ErrorMapper {
    fun <T> map(error: T, params: String? = null): HomunculiError
}