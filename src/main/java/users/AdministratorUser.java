package users;

import interfaces.*;
import book.Book;

public class AdministratorUser extends User implements Administrator {

  static final int MATCHBOOKS = 10;
  static Book[] bookList = new Book[MATCHBOOKS];

  public AdministratorUser(String name) {
    super(name);
  }

  @Override
  public void printList() {
    for (int i = 0; i < bookList.length; i++) {
      if (bookList[i] != null) {
        System.out.println((i + 1) + ") " + bookList[i].toString());
      }
    }
  }

  @Override
  public void findBook(Reader reader, Book book) {
    int result = -1;

    for (int i = 0; i < bookList.length; i++) {
      if (bookList[i] == null)
        continue;

      if (book.getBookName().equals(bookList[i].getBookName()) && book.getAuthor().equals(bookList[i].getAuthor())) {
        result = i;

        System.out.println("Книга есть в наличии. Введите 1 для выдачи книги, или введите `end`.");

        reader.correctUserBookList(1, book);
        bookList[i] = null;
        break;
      }
    }
    if (result == -1) {
      System.out.println("К сожалению, сейчас этой книги нет в наличии.");
    }
  }

  @Override
  public void informationAboutDelay(Reader reader, Book book) {
    if (reader.getDelayTime(book) > 0) {
      System.out.println("Срок сдачи книги истекает через " + reader.getDelayTime(book) + " дней.");
    }
  }
}
