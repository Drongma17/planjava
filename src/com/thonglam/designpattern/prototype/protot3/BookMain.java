package com.thonglam.designpattern.prototype.protot3;

import java.util.ArrayList;
import java.util.List;

public class BookMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book();
        List<Book> listbook=new ArrayList<>();
        book.setBookName("You can win");
        book.setAuthorName("Shiv kera");

        Book book1 = new Book();
        book1.setBookName("Lhangchu");
        book1.setAuthorName("Dhon Gyal");



        Book book2 = (Book)book.clone();
        book2.setBookName("Yeshi Bio");
        book2.setAuthorName("Phakpa");
        listbook.add(book);
        listbook.add(book1);
        listbook.add(book2);

        for(Book b: listbook){
            System.out.println(b);
        }
    }
}
