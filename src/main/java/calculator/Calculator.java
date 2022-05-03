package calculator;

import static java.lang.Double.parseDouble;

public class Calculator {


    public String add(final String adadAval, final String adadDo) {
        final double D1 = parseDouble(adadAval);
        final double D2 = parseDouble(adadDo);
        final double result = D1 +D2;



        return String.valueOf(result);
    }

    }

