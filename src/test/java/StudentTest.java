import PhoneBook.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void testEquals() {
        // given:
        Student student1 = new Student("Kseniya", "AS-206", "67325");
        Student student2 = new Student("Kseniya", "AS-206", "67325");

        // when:
        boolean result = student1.equals(student2);

        // then:
        Assertions.assertEquals(true, result);
    }

}
