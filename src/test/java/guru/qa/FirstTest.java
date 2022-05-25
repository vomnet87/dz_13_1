package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
     void firstTest() {
        Assertions.assertTrue(5>=2);
    }

    @Test
    void firstTest() {
        Assertions.assertTrue(4>=3);
    }
}
