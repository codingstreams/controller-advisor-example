package com.akshay.notes.exceptions;

public class NoteNotFoundException extends RuntimeException{
    public NoteNotFoundException(String message) {
        super(message);
    }
}
