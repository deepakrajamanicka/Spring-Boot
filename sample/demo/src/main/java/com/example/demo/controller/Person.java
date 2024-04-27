package com.example.demo.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pers")
public class Person {
    @Id
    int bookId;
    String title;
    String author;
    String genre;
    String description;
    String publicationYear;
    String isbn;
    
    public Person()
    {

    }

    public Person(int bookId, String title, String author, String genre, String description, String publicationYear,
            String iSBN) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.description = description;
        this.publicationYear = publicationYear;
        this.isbn= iSBN;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() { 
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public String getISBN() { 
        return isbn;
    }

}
