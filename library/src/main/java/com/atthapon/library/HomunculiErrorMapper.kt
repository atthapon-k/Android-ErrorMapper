package com.atthapon.library

class HomunculiErrorMapper(private val errorCode: HashMap<String, ErrorFactory?>) : ErrorMapper {
    override fun <T> map(error: T, params: String?): HomunculiError {
        if (error as? BaseError != null) {
            var errorFactory = errorCode[error.code]
            if (errorFactory == null) {
                errorFactory = errorCode[error.cause?.javaClass?.simpleName]
            }
            return errorFactory?.invoke(params, error.cause, error.code)
                ?: HomunculiErrorFactory.unknown(ErrorType.UNKNOWN_ERROR.value, error.message).invoke(
                    params,
                    error.cause,
                    error.code
                )
        }
        throw TypeCastException("Can not cast $error to HomunculiError type.")
    }
}