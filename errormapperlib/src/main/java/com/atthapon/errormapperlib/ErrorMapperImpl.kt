package com.atthapon.errormapperlib

class ErrorMapperImpl(private val errorCode: HashMap<String, ErrorFactory?>) : ErrorMapper {
    override fun <T> map(error: T, params: String?): Error {
        if (error as? BaseError != null) {
            val errorFactory = errorCode[error.code]
            return errorFactory?.invoke(params, error.cause, error.code)
                ?: ErrorMapperHelper.unknown(ErrorType.UNKNOWN_ERROR.value, error.message).invoke(params, error.cause, error.code)
        }
        throw TypeCastException("Can not cast $error to Error type.")
    }
}