package com.company.certification.retotest.exceptions;

public class RetoException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public RetoException(Exception e) {
        super(e);
    }

}
