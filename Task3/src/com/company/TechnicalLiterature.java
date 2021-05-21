package com.company;

public class TechnicalLiterature extends Department {
    private final String name = "Technical Literature";
    private boolean isComputer;

    public TechnicalLiterature(){}
    public TechnicalLiterature(Book[] books, boolean isComputer) {
        super(books);
        this.isComputer = isComputer;
    }

    public String getName() {
        return name;
    }

    public boolean isComputer() {
        return isComputer;
    }

    public void setComputer(boolean computer) {
        isComputer = computer;
    }

    @Override
    public String toString() {
        return String.format("%s : Number of books %s, %s", name, getCountBooks(), isComputer ? "Компуктеры имеются" : "Нет компкутеров");
    }
}
