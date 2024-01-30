package de.neuefische;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Books in the library: " + Arrays.toString(books) + "\n";
    }

    public void addBook(Book book) {
        // check, if book already exists in library
        boolean found = false;
        for (Book b : books) {
            if (b.equals(book)) {
                found = true;
                break;
            }
        }
        // if book does not exist, add it
        if (!found) {
            Book[] newBooks = new Book[books.length + 1];
            for (int i = 0; i < books.length; i++) {
                newBooks[i] = books[i];
            }
            newBooks[books.length] = book;
            books = newBooks;
        } else {
            System.out.println("This book exists already in the library.");
        }
    }

    public void deleteBook(Book book) {
        // check, if book exists in library
        boolean found = false;
        for (Book b : books) {
            if (b.equals(book)) {
                found = true;
                break;
            }
        }
        // if book exists, delete it
        if (found) {
            Book[] newBooks = new Book[books.length - 1];
            int j = 0;
            for (int i = 0; i < books.length; i++) {
                if (!books[i].equals(book)) {
                    newBooks[j] = books[i];
                    j++;
                }
            }
            books = newBooks;
        } else {
            System.out.println("Book not found in the library.");
        }
    }
}
