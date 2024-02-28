package dk.favrholdt.config;

import dk.favrholdt.ServiceExampleForTesting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServiceTest {

    @Test
    void getNameNegativeNumberTest() {
        ServiceExampleForTesting service = new ServiceExampleForTesting();
        String result = service.getName(-1);

        Assertions.assertEquals("a", result);
    }

    @Test
    void getNamePositiveNumberTest() {
        ServiceExampleForTesting service = new ServiceExampleForTesting();
        String result = service.getName(1);

        Assertions.assertEquals("b", result);
    }

    @Test
    void getNameZeroNumberTest() {
        ServiceExampleForTesting service = new ServiceExampleForTesting();
        String result = service.getName(0);

        Assertions.assertEquals("b", result);
    }
}