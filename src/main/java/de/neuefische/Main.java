package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(new Book[]{
                new Book("Harry Potter", "J.K. Rowling", 123456789),
                new Book("Herr der Ringe", "J.R.R. Tolkien", 987654321),
                new Book("Der kleine Prinz", "Antoine de Saint-Exupéry", 123789456)
        });

        System.out.println(library);

        library.deleteBook(new Book("Harry Potter", "J.K. Rowling", 123456789));
        library.deleteBook(new Book("Der kleine Prinz", "Antoine de Saint-Exupéry", 123789456));
        System.out.println(library);
        library.addBook(new Book("Der kleine Hobbit", "J.R.R. Tolkien", 987654321));
        library.addBook(new Book("Die dunkle Seite der Sonne", "Terry Pratchett", 123789456));

        System.out.println(library);

    }

}