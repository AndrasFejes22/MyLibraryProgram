import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadersTest {

    /*public static void assertEquals(Object expected, Object actual, String message) {
        AssertEquals.assertEquals(expected, actual, message);
    }*/

    @Test
    void getName() {
        Readers reader1 = new Readers();
        reader1.setName("Bela Kiss");
        reader1.setName("Bela");
        //assertTrue(reader1.getName().equals("Bela Kiss"));
        assertEquals("Bela Kiss", reader1.getName()); //expected, actual
    }

    //This will be an error because a number like 025 will be accepted as an octal number = decimal 21

    @org.junit.jupiter.api.Test
    void getAge() {
        Readers reader1 = new Readers();
        reader1.setAge(25);
        reader1.setAge(025);
        assertEquals(25, reader1.getAge()); //expected, actual
    }


}