package com.emil.coupnsproject.exception;

public abstract class CrudDAOException extends Exception {
    public CrudDAOException(final String msg) {
        super(msg);
    }
}
