package ch.bbw.medienverwaltung;

public class Buch extends Medium {
    private String author;
    private String isbn;
    private int pages;

    public Buch(String title, String author, String isbn, int pages) {
        super(title);
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
    }

    @Override
    public void print() {
        System.out.println("Book: " + getTitle() + " by " + author + " (ISBN: " + isbn + ", " + pages + " pages)");
    }
}
