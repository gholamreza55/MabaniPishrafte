package khodro;

public class Ranande {

    private String noegavahi = "paye 1";
    private static String nam = "farhad";



    public class Gavahi {
        public void print() {
            System.out.println("class non static : ");
            System.out.println(noegavahi);
            System.out.println(nam);
        }
    }
    public static class Staticgavahi {
        public void print() {
            System.out.println("class non static : ");
          //  System.out.println(noegavahi);
            System.out.println(nam);
        }
    }

}
