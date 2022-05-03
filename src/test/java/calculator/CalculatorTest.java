package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void BAyad_Do_Adad_Jam() {
        Calculator calculator = new Calculator();
        String haseljam = calculator.add("5.3", "-2");
        Assertions.assertEquals("3.3", haseljam);

    }




}
