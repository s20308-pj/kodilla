package pl.czaplinski.wstepDoKol.kol2b;

public class Book {
    private final int publicationDate;
    private final String title;

    public Book(int publicationDate, String title) {
        this.publicationDate = publicationDate;
        this.title = title;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public String getTitle() {
        return title;
    }
}
