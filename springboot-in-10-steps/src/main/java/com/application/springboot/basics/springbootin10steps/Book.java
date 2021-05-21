package com.application.springboot.basics.springbootin10steps;

public class Book {
    long id;
    String name,author;

    //created constructor
    public Book(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
 //getters

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
    //also add toString


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
