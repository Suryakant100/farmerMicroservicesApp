package com.fas.farmer.exceptions;

/**
 * Simple Custom class for Invalid User Type Category
 *
 * @author Suryakant kumar
 */
public class InvalidUserTypeException extends RuntimeException {
    public InvalidUserTypeException(String msg) {
        super(msg);
    }
}
