/* Author: Omprakash */
package com.Omprakash.bookHub2.entity;


import javax.persistence.*;

@Entity
@Table(name = "books2")
public class Book2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    private String title;
    private String author;
    private double price;

    public Book2() {}

    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
