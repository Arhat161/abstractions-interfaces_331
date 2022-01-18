package ru.netology.interfaces;

import ru.netology.classes.Book;

public interface Librarian {
    public void placeAnOrderForABook(Book book, Supplier supplier);

    public String getLibrarianName();
}
