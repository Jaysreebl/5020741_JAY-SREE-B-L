package com.example.bookstoreapi.model;

import lombok.Data;
import jakarta.persistence.Entity;

@Entity
@Data
public class Author {

    private String name;
    private String bio;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for bio
    public String getBio() {
        return bio;
    }

    // Setter for bio
    public void setBio(String bio) {
        this.bio = bio;
    }

    // Other fields and methods, if any
}