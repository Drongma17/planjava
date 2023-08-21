package com.thonglam.javatechie.lamdasort;

import com.thonglam.javatechie.lamdasort.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks(){

        List<Book> books =new ArrayList<>();
        books.add(new Book(101, "Core Java", 400));
        books.add(new Book(102, "Python", 500));
        books.add(new Book(103, "JavaScript", 600));
        books.add(new Book(104, "Angular", 700));
        books.add(new Book(105, "Spring Boot", 900));

        return books;
    }

}
