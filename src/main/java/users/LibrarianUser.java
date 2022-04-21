package users;

import interfaces.*;
import book.Book;

public class LibrarianUser extends User implements Librarian {

  public LibrarianUser(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Библиотекарь " + userName;
  }

  @Override
  public void orderBook(Librarian librarian, Supplier supplier, Book book) {
    System.out.println("Заказ оформлен.");
    if (supplier.completeTheOrder(supplier, book, librarian)) {
      System.out.println("Заказ доставлен. Книга добавлена.");
      for (int i = 0; i < AdministratorUser.bookList.length; i++) {
        if (AdministratorUser.bookList[i] == null) {
          AdministratorUser.bookList[i] = book;
          break;
        }
      }
    }
  }
}
