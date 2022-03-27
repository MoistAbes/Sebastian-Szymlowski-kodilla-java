package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype<Library> {

    //15.2

    private String name;
    private Set<Book> books = new HashSet<>();

    public Library shallowCopy() throws CloneNotSupportedException{
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{
        Library deepCopy = super.clone();

        deepCopy.books = new HashSet<>();
        deepCopy.books.addAll(books);

        return deepCopy;
    }

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Library library = (Library) o;

        if (!name.equals(library.name)) return false;
        return books != null ? books.equals(library.books) : library.books == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (books != null ? books.hashCode() : 0);
        return result;
    }
}
