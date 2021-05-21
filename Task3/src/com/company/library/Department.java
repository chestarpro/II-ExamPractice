package com.company.library;

import java.util.Scanner;

public class Department {
    private final String name = "Department";
    private final Book[] books = new Book[100000]; // Полки где хранятся кинги
    private static int i;

    public Department(){}

    public String getNameDepartment() {
        return this.name;
    }

    public Book[] getBooks() {
        return this.books;
    }

    public void addBooks(Book book) {
        for (; i < this.books.length;) {
            if (this.books[i] == null) {
                this.books[i] = book;
                break;
            } else this.books[i + 1] = book;break;
        }
        i++;
    }

    public void printBooks() {
        for (Book book : this.books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public void printInfoDepartment() {
        System.out.println(toString());
    }

    public void searchAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя и фамилию автора: ");
        String temp = scanner.nextLine();
        boolean flag = false;
        boolean flag2 = false;
        for (int i = 0; books[i] != null; i++) {
            if (temp.equals(this.books[i].getAuthor())) {
                flag = true;
                if(!flag2){
                    System.out.println("Найдено книг по автору " + temp + ": " );
                    flag2 = true;
                }
                System.out.println(this.books[i]);
            }
        }
        if(!flag) System.out.println("Книг не найдено");
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
        return String.format("Отдел: %s | Число книг %s", name, getCountBooks());
    }
}
