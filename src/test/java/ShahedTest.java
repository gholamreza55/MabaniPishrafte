import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

public class ShahedTest {
      @Test
      void name_10() {
      double [] numbers  = {};
      double result = sumArray(numbers);
      Assertions.assertEquals(0, result);
      }
      @Test
      void name_12() {
      double[] numbers = {-2.398};
      double result = sumArray(numbers);
      Assertions.assertEquals(-2.398, result);
      }
      @Test
      void name_13() {
      double[] numbers = {1, 5.2, 4, 0, -1};
      double result = sumArray(numbers);
      Assertions.assertEquals(9.2, result);
      }

      private double sumArray(double[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }else if (numbers.length == 1) {
            return numbers[0];
        } else {
      int neshanegar = 0;
      double sum = 0;
          while (neshanegar < numbers.length) {
                out.println("index is :" + neshanegar);
                out.println("sum index is :" + numbers[neshanegar]);
                sum = sum + numbers[neshanegar];
                out.println("sum is :" + sum);
                neshanegar++;

          }
            return sum;
      }

       }

    //    @Test
//    void salam_5() {
//        for (int neshanegar = 0; neshanegar < 3; neshanegar++) {
//            salamkon();
//        }
//        tamamkon();
//    }
//    @Test
//    void name_9() {
//        int neshanegar = 0;
//        do {
//            salamkon();
//            neshanegar++;
//        }while (neshanegar > 3);
//        tamamkon();
//    }
//    private void tamamkon() {
//        out.println("tamam shod");
//    }
//
//    @Test
//    void name_8() {
//        int neshanegar = 0;
//        while (neshanegar < 3) {
//            neshanegar++;
//            salamkon();
//        }
//        tamamkon();
//    }
//
//    private void salamkon() {
//        out.println("salam");
//    }

}
    //    @Test
//    void num_1() {
//        int number_1 = 5;
//        int number_2 = 6;
//        int result = add(number_1, number_2);
//        assertEquals(11, result);
//    }
//
//    private int add(int number_1, int number_2) {
//        int result = number_1 + number_2;
//        return result;
//    }
//    @Test
//    void num_2() {
//        int number_1 = 5;
//        int number_2 = 6;
//        int result = multiple(number_1, number_2);
//        assertEquals(30, result);
//    }
//
//    private int multiple(int number_1, int number_2) {
//        return number_1 * number_2;
//    }
//    @Test
//    void num_3() {
//        int number_1 = 5;
//        int number_2 = 6;
//        int result = circle(number_1, number_2);
//        assertEquals(1, result);
//    }
//
//    private int circle(int number_1, int number_2) {
//        return number_2 / number_1;
//    }

    //    @Test
//    void name() {
//        int[] number = new int[5];
//        number[2] = 3;
//        number[0] = 4;
//        System.out.println(Arrays.toString(number));
//
//    }
//    @Test
//    void bak() {
       // String[][] car = {{"ali", "reza", "asgar"},{"mah", "akbar", "rouh"},{"mahya", "nahid","naser"}};
//        String [][] car = new String[3][3];  // string ro mesle bala ham mishe nevsht
//        car[0][0] = "naser";
//        car[0][1] = "nader";
//        car[0][2] = "zahra";
//        car[1][0] = "sama";
//        car[1][1] = "bahram";
//        car[1][2] = "tol";
//        car[2][0] = "maryam";
//        car[2][1] = "leila";
//        car[2][2] = "safa";
//
//
//        System.out.println(car.length);
//
//        for (int i = 0; i < car.length; i++ ) {
//            System.out.println();
//            for (int j = 0; j < car[i].length; j++){
//                System.out.println(car[i][j]);
//            }
//        }
//
  //  }
    //    @Test
//    void if_else() {
//        salamkon();
//
//        int zoj = 8;
//        boolean shart = zoj % 2 == 0;
//        System.out.println(shart);
//        if (shart) {
//           // benevisZoj("zoj");
//            benevis("zoj");
//        }else {
//           // beneviseFard("fard");
//            benevis("fard");
//        }
//       }
//    private void benevis(String megdar) {
//        System.out.println("adad " + megdar + "ast");
//    }
//
//    private void beneviseFard(String add) {
//        System.out.println("adad " + add + "ast");  //in 2 ta tabdil shod be privet (megdar) bala
//    }
//
//    private void benevisZoj(String even) {
//        System.out.println("adad " + even + "ast");
   // }
//
//    void salamkon() {
//           System.out.println("salam");
//       }


//    @Test
//    void if_else() {
//        int fard = 8;
//        if (fard % 2 == 0){    //(Ctrl+Alt+V)dar roye mizanim va tabdil be paein mishavad (fard % 2 == 0)
//            System.out.println("adad zoj ast");


    //    @Test
//    void if_else() {
//        int zoj = 8;
//        boolean shart = zoj % 2 == 0;
//        System.out.println(shart);
//        if (shart) {
//            System.out.println("adad zoj ast");
//        }else {
//            System.out.println("adad fard ast");
//        }
 //         }

    //    @Test
//    void Arayeh() {
//        String[] zaban = {"ali", "reza", "gholam"};
//        System.out.println(zaban[0]);
//        System.out.println(zaban[1]);
//        System.out.println(zaban[2]);
//        zaban[1] = "akbar";
//        System.out.println(zaban[1]);
//        int length = zaban.length;
//        System.out.println("andaze araye " + length + " ast");
//        String number = "12" + 21;
//        System.out.println(number);
//        int numbers = 12 + 21;
//        System.out.println(numbers);
//
//    }
    //    @Test
//    void name() {
//        int number_1 = 3;
//        int number_2 = 6;
//        int result = number_1 + number_2;
//        int result_1 = number_1 * number_2;
//        System.out.println(result);
//        System.out.println(result_1);
//    }
//
//    @Test
//    void name_1() {
//        double number_1 = 51;
//        double number_2 = 21;
//        double result = number_1 + number_2;
//        double result_2 = number_1 * number_2;
//        double result_3 = number_1 / number_2;
//        System.out.println(result);
//        System.out.println(result_2);
//        System.out.println(result_3);
////
////    }
//
//    @Test
//    void name_3() {
//        int num = 2;
//        int result = summation(num);
//        assertEquals(3, result);
//    }
//
//    @Test
//    void name_36() {
//        int num = 8;
//        int result = summation(num);
//        Assertions.assertEquals(36, result);
//    }
//
//    @Test
//    void name_11() {
//        int num = 11;
//        int result = summation(num);
//        Assertions.assertEquals(66, result);
//    }
//
//    @Test
//    void name_0() {
//
//    }
//
//    private int summation(int num) {
//        int sum = 0;
//        for (int neshanegar = 1; neshanegar <= num; neshanegar++) {
//
//            sum = sum + neshanegar;
//        }
//    }




