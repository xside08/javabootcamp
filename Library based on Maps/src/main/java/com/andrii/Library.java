package main.java.com.andrii;

import java.util.*;

public class Library {
    private Map<Date, Book> booksOblik = new HashMap<>();
    private List<Book> booksList = new ArrayList<>();

    public List<Book> setBooksList() {
        booksList.add(new Book(2003, "QA", "Shevchenko"));
        booksList.add(new Book(1992, "One long story about", "Franko"));
        booksList.add(new Book(2020, "Fairytale", "Lesia"));
        booksList.add(new Book(1995, "Jack and Jones", "Drahomanov"));
        booksList.add(new Book(2018, "Horror Stories", "Chill"));
        booksList.add(new Book(2000, "Wiki", "Author"));
        return booksList;
    }

    public Map<Date, Book> getBooksOblik() {
        return booksOblik;
    }

    public void showBooksAccounting() {
        Set<Date> dates = booksOblik.keySet();
        for (Date date : dates) {
            Book book = booksOblik.get(date);
            System.out.println(date.toString() + " | " + book.toString());
        }
    }

    public void addBookToAccounting(Date date, Book book) {
        booksOblik.put(date, book);
    }

    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }


    public void deleteBookFromBookList(Book bookForDeleting) {
        Iterator<Book> iterator = booksList.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (bookForDeleting.equals(book)) {
                iterator.remove();
            }
        }
    }
}
