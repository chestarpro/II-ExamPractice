package com.company.library;

public class TechnicalLiterature extends Department {
    private final String name = "Техниская литература";
    private boolean isComputer;
    private static int i;

    public TechnicalLiterature(){}

    public TechnicalLiterature(boolean isComputer){
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
    public void addBooks(Book book) {
        for (; i < getBooks().length;) {
            if (this.getBooks()[i] == null) {
                this.getBooks()[i] = book;
                break;
            } else this.getBooks()[i + 1] = book;break;
        }
        i++;
    }

    @Override
    public String toString() {
        return String.format("Отдел: %s | Число книг %s | %s" , name, getCountBooks(), isComputer ? "Компуктеры имеются" : "Нет компкутеров");
    }
}
