package pl.czaplinski.wstepDoKol.kol2b;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Book> booksList = new LinkedList<>();
        booksList.add(new Book(1999, "Krew elfów"));
        booksList.add(new Book(2000, "Czas pogardy"));
        booksList.add(new Book(2001, "Chrzest ognia"));
        booksList.add(new Book(1993, "Wieża Jaskółki"));
        booksList.add(new Book(2011, "Pani Jeziora"));
        booksList.add(new Book(1985, "Miecz przeznaczenia"));
        booksList.add(new Book(1995, "Hobbit"));
        booksList.add(new Book(1996, "Drużyna Pierścienia"));
        booksList.add(new Book(2001, "Dwie wieże"));
        booksList.add(new Book(1999, "Powrót króla"));

        for (Book book : booksList) {
            if (book.getPublicationDate()<2000){
                System.out.println(book.getTitle());
            }
        }
    }
}
