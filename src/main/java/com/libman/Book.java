package com.libman;

public class Book {
    public String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
