package com.thonglam.javatechie.lamdasort;


import java.util.Objects;

public class Book {
    private int id;
    private String name;
    private int page;


    public Book(int id, String name, int page) {
        this.id = id;
        this.name = name;
        this.page = page;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && page == book.page && name.equals(book.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, page);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", page=" + page +
                '}';
    }
}
