package users;

import interfaces.*;
import book.Book;
import java.util.Random;

public class SupplierUser extends User implements Supplier, Reader {
  String organization;
  int numberOrder;

  public SupplierUser(String name, String organization) {
    super(name);
    this.organization = organization;
  }

  @Override
  public Book[] getUserBookList() {
    return userBookList;
  }

  @Override
  public boolean completeTheOrder(Supplier supplier, Book book, Librarian librarian) {
    int min = 1;
    int max = 100000;
    int diff = max - min;
    Random random = new Random();
    numberOrder = random.nextInt(diff + 1) + min;

    System.out.println("Заказ № " + numberOrder + " принят в работу. Представитель заказчика: " + librarian.toString());
    System.out.println("Книга ``" + book.getBookName() + "`` в пути.");

    return true;
  }

  // ПЕРЕОПРЕДЕЛЕНИЕ МЕТОДОВ ИНТЕРФЕЙСА READER

  @Override
  public String toString() {
    return "ФИО: " + userName + ", " + "книг на руках: " + takenBook;
  }

  @Override
  public void correctUserBookList(int operation, Book book) {
    switch (operation) {
      case 1: // add
        for (int i = 0; i < userBookList.length; i++) {
          if (userBookList[i] == null) {
            userBookList[i] = book;
            break;
          }
        }
        takenBook++;

        System.out.println("Книга добавлена в вашу карточку. У вас на руках " + takenBook + " книг(а/и).");
        break;

      case 2: // delete
        for (int i = 0; i < userBookList.length; i++) {
          if (userBookList[i].getBookName().equals((book.getBookName()))) {
            userBookList[i] = null;
            break;
          }
        }
        takenBook--;
        System.out.println("Книга возвращена. У вас на руках " + takenBook + " книг(а/и).");
        break;
    }
  }

  @Override
  public int getDelayTime(Book book) {
    int delayTime = 0;
    for (int i = 0; i < userBookList.length; i++) {
      if (userBookList[i] != null && userBookList[i].getBookName().equals(book.getBookName())) {
        delayTime = userBookList[i].getDelay();
        break;
      }
    }
    return delayTime;
  }

}
