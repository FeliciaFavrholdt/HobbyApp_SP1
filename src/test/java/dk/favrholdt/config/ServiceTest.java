package dk.favrholdt.config;

import dk.favrholdt.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServiceTest {

    @Test
    void getNameNegativeNumberTest() {
        Service service = new Service();
        String result = service.getName(-1);

        Assertions.assertEquals("a", result);
    }

    @Test
    void getNamePositiveNumberTest() {
        Service service = new Service();
        String result = service.getName(1);

        Assertions.assertEquals("b", result);
    }

    @Test
    void getNameZeroNumberTest() {
        Service service = new Service();
        String result = service.getName(0);

        Assertions.assertEquals("b", result);
    }
}