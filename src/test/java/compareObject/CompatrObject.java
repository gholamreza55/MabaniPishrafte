package compareObject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompatrObject {
    @Test
    void should_compare_primitive() {
        int x = 1;
        int y = 1;
        int x1 = x;
        System.out.println(x1);
        assertEquals(1, 1);
        assertEquals(1, 1);
        assertEquals(1.2, 1.2);
        assertEquals(-1, -1);

    }

    @Test
    void should_compare_non_primitive() {
        String s = new String("reza");
        String s1 = new String("reza");
       // System.out.println(s1);
     //   System.out.println(s);
     //   System.out.println(s.equals(s1));
     //   System.out.println(s == s1);
        String s3 = new String("Reza");
    //    System.out.println(s.equals(s3));
      //  System.out.println(s.equalsIgnoreCase(s3));
        String se = "sepehr";
        String se1 = "sepehr";
    //    System.out.println(se.equals(se1));
        System.out.println(se == se1);


    }

    @Test
    void should_null() {
        String s = null;

        String s1 = " ";
        System.out.println(s == s1);
        System.out.println(s.equals(s1));
    }
}
