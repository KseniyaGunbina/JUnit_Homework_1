package interfaces;

import book.Book;

public interface Librarian {
  
  void orderBook(Librarian librarian, Supplier supplier, Book book);
  public String toString();
} 