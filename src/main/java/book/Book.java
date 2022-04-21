package book;

public class Book {
  String bookName;
  String author;
  int delayTime = 10;

  public Book(String bookName, String author) {
    this.author = author;
    this.bookName = bookName;
  }

  public String toString() {
    return "`` " + bookName + " ``, " + "Автор: " + author + " , срок сдачи: " + delayTime + " дней.";
  }

  public String getBookName() {
    return bookName;
  }

  public String getAuthor() {
    return author;
  }

  public int getDelay() {
    return delayTime;
  }
}
