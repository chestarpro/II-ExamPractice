package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Department {
    private final String name = "Department";
    private Book[] books = new Book[100000]; // Я так понял что это полки для книг. Я спец не поставил final что бы конструктор тоже принимал книги.
    private static int i;
    private int index;
    private int index2;

    public Department(){}
    public Department(Book[] books) {
        this.books = books;
    }

    public String getNameDepartment() {
        return name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void addBooks() {
        Scanner scanner = new Scanner(System.in);

        String author; int id; String name; int year;

        System.out.print("Enter author: ");
        author = scanner.nextLine();

        System.out.print("Enter id: ");
        id = scanner.nextInt();

        System.out.print("Enter name: ");
        String bag = scanner.nextLine();
        name = scanner.nextLine();

        System.out.print("Enter year: ");
        year = scanner.nextInt();

        for (; i < this.books.length;) {
            if (this.books[i] == null) {
                this.books[i] = new Book(author, id, name, year);
                index = i;
                break;
            } else this.books[i + 1] = new Book(author, id, name, year);index = i;break;
        }
        i++;
    }

    public void printBooks() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public void printInfoDepartment() {
        System.out.print(toString());
    }

    public void searchAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите автора нужной книги: ");
        String temp = scanner.nextLine();
        int temp2 = 0;
        for (int i = 0; i < books.length; i++) {
                if(temp.equals(books[i].getAuthor())) {
                    System.out.println(books[i]);
                    temp2 = 1;
                    break;
            } else System.out.println("Нет такой книги");

        }

    }

    public int getCountBooks () {
        int count = 0;
        for (Book book : books) {
            if (book != null) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return String.format("%s : Number of books %s", name, getCountBooks());
    }
}
