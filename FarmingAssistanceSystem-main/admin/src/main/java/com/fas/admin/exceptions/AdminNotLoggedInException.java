package com.fas.admin.exceptions;


public class AdminNotLoggedInException extends RuntimeException {
    public AdminNotLoggedInException(String msg) {
        super(msg);
    }
}
