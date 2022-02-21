package com.emil.coupnsproject.exception;

import javax.lang.model.type.ErrorType;

public class ApplicationException extends CrudDAOException{
    public ApplicationException(String msg) {
        super(msg);
    }

    private ErrorType errorType;

    // This is used when the exception is intentionally thrown
    public ApplicationException(ErrorType errorType, String message) {
        super(message);
        this.errorType = errorType;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}
