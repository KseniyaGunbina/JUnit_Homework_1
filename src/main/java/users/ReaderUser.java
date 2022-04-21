package users;

import interfaces.*;
import book.Book;

public class ReaderUser extends User implements Reader {

  public ReaderUser(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "ФИО: " + userName + ", " + "книг на руках: " + takenBook;
  }

  @Override
  public Book[] getUserBookList() {
    return userBookList;
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
