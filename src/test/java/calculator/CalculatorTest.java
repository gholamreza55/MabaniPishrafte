package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void Bayad_do_adad_jam() {
        Calculator calculator = new Calculator();

        String haselejam = calculator.add("5.3", "-2");

        Assertions.assertEquals("3.3", haselejam);
    }
}
