 package ch.bbw.medienverwaltung;

import java.awt.print.Book;

public class Buch {

    private String title;
    private String author;
    private String isbn;
    private int pages;


    public Buch(String title, String author, String isbn, int pages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Buch:" +
                "\n    title='" + title + '\'' +
                "\n    author='" + author + '\'' +
                "\n    isbn='" + isbn + '\'' +
                "\n    pages=" + pages;
    }

    public void print() {
        System.out.println("Buch:" +
                "\n    title='" + title + '\'' +
                "\n    author='" + author + '\'' +
                "\n    isbn='" + isbn + '\'' +
                "\n    pages=" + pages);
    }
}
