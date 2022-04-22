package calculator;

import javax.accessibility.AccessibleValue;

import static java.lang.Double.parseDouble;

public class Calculator {
    public String add(String adadAval, String adadovo) {
        double d1 = parseDouble(adadAval);
        double d2 = parseDouble(adadovo);
        double result = d1 + d2;
        return String.valueOf(result);
    }
}
