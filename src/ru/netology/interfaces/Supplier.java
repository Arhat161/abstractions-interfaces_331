package ru.netology.interfaces;

import ru.netology.classes.Book;

public interface Supplier {
    public void supplyBookToThelibrary(Book book, Librarian librarian);

    public String getSupplierName();
}
