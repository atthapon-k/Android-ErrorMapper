package com.atthapon.erdrorlib

interface ErrorMapper {
    fun <T> map(error: T, params: String? = null): Error
}