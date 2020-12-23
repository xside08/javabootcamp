package main.java.com.andrii;

import java.util.Objects;

public class Book {
    int yearOfPublishing;
    String title;
    String writer;

    public Book(int yearOfPublishing, String title, String writer) {
        this.yearOfPublishing = yearOfPublishing;
        this.title = title;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return " \"" + title + "\", " + yearOfPublishing +
                ", " + writer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing &&
                Objects.equals(title, book.title) &&
                Objects.equals(writer, book.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfPublishing, title, writer);
    }
}