package interfaces;

import book.Book;

public interface Supplier {

  boolean completeTheOrder(Supplier supplier, Book book, Librarian librarian);
}
