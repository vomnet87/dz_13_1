package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
     void firstTest() {
        Assertions.assertFalse(5<2);
    }

    @Test
    void firstTest() {
        Assertions.assertFalse(4<3);
    }
}
