
import book.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import users.SupplierUser;
public class UsersSupplierUserTest {

    @Test
    public void testCorrectUserBookList() {
        // given:
        Book bookOne = new Book("Война и мир", "Л.Н.Толстой");
        Book bookTwo = new Book("Гарри Поттер и Философский камень", "Д.Роулинг");
        SupplierUser supplier = new SupplierUser("Василиса Ивановна Сказкина", "ОАО `Fairytale");
        // when:
        supplier.correctUserBookList(1, bookOne);
        // then:
        Assertions.assertNotNull(supplier.getUserBookList());
    }
}
