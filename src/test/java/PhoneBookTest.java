import PhoneBook.Contact;
import PhoneBook.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.NullString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;


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

    @Test
    public void testAddGroup() {
        String name = "Friends";
        PhoneBook phoneBook = new PhoneBook();
        boolean result = phoneBook.addGroup(name).containsKey(name);
        boolean exception = true;
        Assertions.assertEquals(result, exception);
    }

    @Test
    public void testFindContactOnGroup() {
        PhoneBook phoneBook = new PhoneBook();
        List<Contact> contact = new ArrayList<>();
        contact.add(new Contact("+79313377785", "Kseniya"));
        phoneBook.getPhoneBook().put("Friends", contact);
        boolean result1 = phoneBook.findContactOnGroup("Friends", contact.get(0));
        boolean result2 = phoneBook.findContactOnGroup("Parents", contact.get(0));
        boolean exception1 = true;
        boolean exception2 = false;
        Assertions.assertEquals(result1, exception1);
        Assertions.assertEquals(result2, exception2);
    }
}
