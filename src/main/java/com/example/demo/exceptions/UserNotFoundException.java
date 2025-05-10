package com.example.demo.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(int id) {
        super("User with ID " + id + " was not found.");
    }
}
