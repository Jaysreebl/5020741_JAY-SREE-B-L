package com.example.bookstoreapi.dto;

public class BookDTO {

    private Long id;
    private String title;
    private String author;
    private Double price;
    private String isbn;

    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for price
    public Double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(Double price) {
        this.price = price;
    }

    // Getter for isbn
    public String getIsbn() {
        return isbn;
    }

    // Setter for isbn
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
