package com.atthapon.errormapperlib

interface ErrorMapper {
    fun <T> map(error: T, params: String? = null): Error
}