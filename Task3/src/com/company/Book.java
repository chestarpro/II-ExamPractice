package com.company;

public class Book {
    private String author;
    private int id;
    private String name;
    private int year;

    public Book(){}

    public Book(String author, int id, String name, int year) {
        this.author = author;
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getFinalLengthArrBook () {
        Department length = new Department();
        return length.getBooks().length;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
