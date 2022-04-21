package interfaces;

import book.Book;

public interface Reader {

  void correctUserBookList(int operation, Book book);
  public int getDelayTime(Book book);
  public Book[] getUserBookList();
  public String toString();

}
