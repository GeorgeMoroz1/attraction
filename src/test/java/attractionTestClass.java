import main.java.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class attractionTestClass {
    Person person = new Person(null, "Петров", -3);
@BeforeEach
public void beforeEach(){
    System.out.println("Проверка перед тестом");
}
@AfterEach
public void afterEach(){
    System.out.println("Проверка после теста");
}
    @Test
    public void testAddPerson() {

        Assertions.assertTrue(person.getNumberOfTickets() > 0);
    }

    @Test
    public void testIsNotNull() {
        Assertions.assertNotNull(person.getPassengerFirstName());
    }

    @Test
    public void testIsEmpty() {
        Assertions.assertFalse(person.getPassengerLastName().isEmpty());
    }
}
