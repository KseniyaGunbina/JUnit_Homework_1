import PhoneBook.Contact;
import PhoneBook.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


public class PhoneBookTest {

    @Test
    public void testCheck() {
        // given:
        Contact contact1 = new Contact("+79313377785", "Kseniya");
        Contact contact2 = new Contact("+795000630", "Sasha");
        List<Contact> list = new ArrayList<>();
        list.add(contact1);
        PhoneBook phoneBook = new PhoneBook();
        // when:
        boolean result1 = phoneBook.check(list, contact1);
        boolean result2 = phoneBook.check(list, contact2);
        // then:
        Assertions.assertEquals(result1, false);
        Assertions.assertEquals(result2, false);

    }

}
