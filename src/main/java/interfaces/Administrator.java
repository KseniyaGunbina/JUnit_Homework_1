package interfaces;

import book.Book;

public interface Administrator {

  void findBook(Reader reader, Book book);
  void informationAboutDelay(Reader reader, Book book);
  void printList();
}



