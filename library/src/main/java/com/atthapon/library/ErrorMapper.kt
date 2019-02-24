package com.atthapon.library

interface ErrorMapper {
    fun <T> map(error: T, params: String? = null): Error
}