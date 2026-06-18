package com.polarbookshop.catalog_service.expections;

public class BookAlreadyExistsException extends RuntimeException{
    public BookAlreadyExistsException(String isbn) {
        super("A book with isbn " + isbn + " already exists.");
    }
}
