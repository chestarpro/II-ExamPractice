package com.company.library;

public class Library {
    public static void main(String[] args) {
        ArtLiterature artLiterature = new ArtLiterature(); // Отделы библиотеки
        LegalLiterature legalLiterature = new LegalLiterature();
        TechnicalLiterature technicalLiterature = new TechnicalLiterature(true);

        Book whiteSteamship = new Book("Чынгыз Айтматов",616507,"Белый пароход",1970);
        Book firstTeacher = new Book("Чынгыз Айтматов",391017,"Первый учитель",1962);
        Book theQueenOfSpades = new Book("Александр Пушкин",598134,"Пиковая дама",1833);
        Book warAndPeace = new Book("Лев Толстой", 610566,"Война и мир",1865);

        System.out.println(artLiterature.getName());

        artLiterature.addBooks(whiteSteamship);
        artLiterature.addBooks(firstTeacher);
        artLiterature.addBooks(theQueenOfSpades);
        artLiterature.addBooks(warAndPeace);

        artLiterature.printBooks();
        artLiterature.searchAuthor();
        System.out.println();
        artLiterature.printInfoDepartment();
        System.out.println("------------------------------------------------------------------------------------------");

        Book civilCodeForDummies1 = new Book("Дмитрий Усольцев",920624,"Гражданский кодекс для чайников 1",2016);
        Book civilCodeForDummies2 = new Book("Дмитрий Усольцев",930534,"Гражданский кодекс для чайников 2",2018);

        System.out.println(legalLiterature.getName());

        legalLiterature.addBooks(civilCodeForDummies1);
        legalLiterature.addBooks(civilCodeForDummies2);

        legalLiterature.printBooks();
        legalLiterature.searchAuthor();
        System.out.println();
        legalLiterature.printInfoDepartment();
        System.out.println("------------------------------------------------------------------------------------------");

        Book javaWebServices = new Book("Тимур Машнин",97752,"Web-сервисы Java",2011);
        Book digitalTransformation = new Book("Александр Чесалов",982970,"Цифровая трансформация",2020);

        System.out.println(technicalLiterature.getName());

        technicalLiterature.addBooks(javaWebServices);
        technicalLiterature.addBooks(digitalTransformation);

        technicalLiterature.printBooks();
        technicalLiterature.searchAuthor();
        System.out.println();
        technicalLiterature.printInfoDepartment();
    }
}
