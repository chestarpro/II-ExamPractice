package com.company;

public class ArtLiterature extends Department {
    private final String name = "Art Literature";

    public ArtLiterature() {}

    public ArtLiterature(Book[] books) {
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
