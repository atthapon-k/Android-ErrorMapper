package com.atthapon.errormapperlib

import kotlin.Exception

typealias ErrorFactory = (params: String?, cause: Exception?, causeCode: String?) -> Error

object ErrorMapperHelper {

    fun customError(type: String, code: String, message: String): ErrorFactory {
        return { params: String?, cause: Exception?, causeCode: String? ->
            Error(type, code).build(message, params, cause, causeCode)
        }
    }

    fun badRequest(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Exception?, causeCode: String? ->
            Error(ErrorType.BAD_REQUEST.value, code).build(message, params, cause, causeCode)
        }
    }

    fun unauthorized(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Exception?, causeCode: String? ->
            Error(ErrorType.UNAUTHORIZED.value, code)
                .build(message, params, cause, causeCode)
        }
    }

    fun unavailable(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Exception?, causeCode: String? ->
            Error(ErrorType.UNAVAILABLE.value, code).build(message, params, cause, causeCode)
        }
    }

    fun notFound(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Exception?, causeCode: String? ->
            Error(ErrorType.NOT_FOUND.value, code).build(message, params, cause, causeCode)
        }
    }

    fun internalError(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Exception?, causeCode: String? ->
            Error(ErrorType.INTERNAL_ERROR.value, code)
                .build(message, params, cause, causeCode)
        }
    }

    fun timeout(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Exception?, causeCode: String? ->
            Error(ErrorType.TIMEOUT.value, code).build(message, params, cause, causeCode)
        }
    }

    fun notImplement(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Exception?, causeCode: String? ->
            Error(ErrorType.NOT_IMPLEMENT.value, code)
                .build(message, params, cause, causeCode)
        }
    }

    fun forbidden(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Exception?, causeCode: String? ->
            Error(ErrorType.FORBIDDEN.value, code).build(message, params, cause, causeCode)
        }
    }

    fun unknown(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Exception?, causeCode: String? ->
            Error(ErrorType.UNKNOWN_ERROR.value, code)
                .build(message, params, cause, causeCode)
        }
    }
}