package com.application.springboot.basics.springbootin10steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {
    //bcs tomcat embedded automatically so url is http://localhost:8080
    // books added hardcoded to mapping so url is http://localhost:8080/books
     @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(
                new Book(1l, "DataBase Book","Sheetal"));
    }

}
