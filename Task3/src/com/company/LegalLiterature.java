package com.company;

public class LegalLiterature extends  Department{
    private final String name = "Legal Literature";

    public LegalLiterature(){}
    public LegalLiterature(Book[] books) {
        super(books);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s : Number of books %s", name, getCountBooks());
    }
}
