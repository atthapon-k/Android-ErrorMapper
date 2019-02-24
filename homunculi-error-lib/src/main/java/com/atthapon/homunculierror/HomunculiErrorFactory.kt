package com.atthapon.homunculierror

typealias ErrorFactory = (params: String?, cause: Throwable?, causeCode: String?) -> HomunculiError

object HomunculiErrorFactory {

    fun customError(type: String, code: String, message: String): ErrorFactory {
        return { params: String?, cause: Throwable?, causeCode: String? ->
            HomunculiError(type, code).build(message, params, cause, causeCode)
        }
    }

    fun badRequest(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Throwable?, causeCode: String? ->
            HomunculiError(ErrorType.BAD_REQUEST.value, code).build(message, params, cause, causeCode)
        }
    }

    fun unauthorized(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Throwable?, causeCode: String? ->
            HomunculiError(ErrorType.UNAUTHORIZED.value, code)
                .build(message, params, cause, causeCode)
        }
    }

    fun unavailable(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Throwable?, causeCode: String? ->
            HomunculiError(ErrorType.UNAVAILABLE.value, code).build(message, params, cause, causeCode)
        }
    }

    fun notFound(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Throwable?, causeCode: String? ->
            HomunculiError(ErrorType.NOT_FOUND.value, code).build(message, params, cause, causeCode)
        }
    }

    fun internalError(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Throwable?, causeCode: String? ->
            HomunculiError(ErrorType.INTERNAL_ERROR.value, code)
                .build(message, params, cause, causeCode)
        }
    }

    fun timeout(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Throwable?, causeCode: String? ->
            HomunculiError(ErrorType.TIMEOUT.value, code).build(message, params, cause, causeCode)
        }
    }

    fun notImplement(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Throwable?, causeCode: String? ->
            HomunculiError(ErrorType.NOT_IMPLEMENT.value, code)
                .build(message, params, cause, causeCode)
        }
    }

    fun forbidden(code: String, message: String): ErrorFactory {
        return { params: String?, cause: Throwable?, causeCode: String? ->
            HomunculiError(ErrorType.FORBIDDEN.value, code).build(message, params, cause, causeCode)
        }
    }

    fun unknown(code: String, message: String?): ErrorFactory {
        return { params: String?, cause: Throwable?, causeCode: String? ->
            HomunculiError(ErrorType.UNKNOWN_ERROR.value, code)
                .build(message, params, cause, causeCode)
        }
    }
}