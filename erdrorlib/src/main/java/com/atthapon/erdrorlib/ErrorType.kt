package com.atthapon.erdrorlib

enum class ErrorType(val value: String) {
    BAD_REQUEST("BadRequest"),
    UNAUTHORIZED("Unauthorized"),
    FORBIDDEN("Forbidden"),
    NOT_FOUND("NotFound"),
    TIMEOUT("Timeout"),
    INTERNAL_ERROR("InternalError"),
    NOT_IMPLEMENT("NotImplement"),
    UNAVAILABLE("Unavailable"),
    UNKNOWN_ERROR("UnknownError")
}