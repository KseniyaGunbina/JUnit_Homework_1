package users;

import book.Book;

public abstract class User {
  final int maxCountOfBook = 4;

  String userName;
  int takenBook;


  Book[] userBookList = new Book[maxCountOfBook];

  public User(String name) {
    this.userName = name;
  }

  public void printList() {
    for (int i = 0; i < userBookList.length; i++) {
      if (userBookList[i] != null) {
        System.out.println((i + 1) + ") " + userBookList[i].toString());
      }
    }
  }
}
