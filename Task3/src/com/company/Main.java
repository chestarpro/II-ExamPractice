package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArtLiterature artLiterature = new ArtLiterature();
        artLiterature.addBooks();
        artLiterature.addBooks();
        artLiterature.printBooks();
        artLiterature.printInfoDepartment();
        artLiterature.searchAuthor();
        System.out.println(artLiterature);

        Book[] book = new Book[artLiterature.getBooks().length];
        book[0] = new Book("6", 6, "6", 6);
        book[1] = new Book("6", 6, "6", 6);

        LegalLiterature legalLiterature = new LegalLiterature(book);
        legalLiterature.addBooks();
        legalLiterature.printBooks();
        legalLiterature.printInfoDepartment();
        legalLiterature.searchAuthor();
        System.out.println(legalLiterature.getCountBooks());
        System.out.println(legalLiterature);

        TechnicalLiterature technicalLiterature = new TechnicalLiterature();
        technicalLiterature.addBooks();
        technicalLiterature.printBooks();
        technicalLiterature.printInfoDepartment();
        technicalLiterature.searchAuthor();
        System.out.println(technicalLiterature);
        System.out.println(technicalLiterature.getCountBooks());
    }
}
