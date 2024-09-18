package ch.bbw.medienverwaltung;

public abstract class Medium {
    private String title;

    public Medium(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Abstrakte Methode, die in den Unterklassen implementiert werden muss
    public abstract void print();
}
