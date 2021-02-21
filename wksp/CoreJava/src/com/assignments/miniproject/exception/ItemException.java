package com.assignments.miniproject.exception;

public class ItemException extends RuntimeException{
    public ItemException() {
        System.out.println("Item does not exist!");
    }

    public ItemException(String message) {
        super(message);
    }
}
