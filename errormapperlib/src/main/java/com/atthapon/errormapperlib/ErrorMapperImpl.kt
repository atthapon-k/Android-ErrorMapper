package com.atthapon.errormapperlib

class ErrorMapperImpl(val errorCode: HashMap<String, ErrorFactory>) : ErrorMapper {
    override fun <T> map(error: T, params: String?): Error {
        if (error as? BaseError != null) {
            val errorFactory = errorCode[error.code]
            if (errorFactory != null) {
                return errorFactory.invoke(params, error.cause, error.code)
            } else {
                throw IllegalArgumentException("Not found error factory with code ${error.code}")
            }
        }
        throw TypeCastException("Can not cast $error to Error type.")
    }
}