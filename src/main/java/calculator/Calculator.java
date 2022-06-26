package calculator;
import static java.lang.Double.parseDouble;

public class Calculator {
    public String add(final String adadAval, final String adadDo) {
        double D1 , D2;
        try {
            D1 = parseDouble(adadAval);
            D2 = parseDouble(adadAval);
        }catch (NumberFormatException nfe){
            System.out.println("adada vared shode ghabele gaboul nist");
            throw nfe;
        }catch (Exception e){
            System.out.println("yek khataye ghabele pishbini");
            throw e;
        }
            finally {
            System.out.println("lotfan dobare emtahan konid");
        }
        final double result = D1 +D2;
        return String.valueOf(result);
    }
  }

