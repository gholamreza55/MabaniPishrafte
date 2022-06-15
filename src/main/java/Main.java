import khodro.mashin.Dande;
import khodro.Mashin;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        for (int index = 0; index < args.length; index++) {
            out.println(args[index]);
        }

        String mark = args[0];
        String gonjayeshSandogh = args[1];
        Dande noeDande =Dande.valueOf(args[2]);
        Mashin mashin = new Mashin(mark, Integer.parseInt(gonjayeshSandogh), noeDande);
        if (mashin.ayaDarHaleHarekatAst()) {
            out.println("aya Dar Hale Harekat Ast");
        }else {
            out.println("Mashin park ast");
        }
        out.println(mashin.getmark());

        Scanner scanner = new Scanner(System.in);

        out.println("esme shoma chiye");
        String nam = scanner.nextLine();

        out.println("lotfan sene khod");
        String sen = scanner.nextLine();

        out.println("lotfan tedade bache");
        String bache = scanner.nextLine();

        out.println("Dar che shahri");
        String shahremahle = scanner.nextLine();



        Scanner scanner1 = new Scanner(System.in);
        out.println("esme pedar");
        String esmepedar = scanner.nextLine();

        out.println("man " + nam + " hastam " + sen + " sal " + bache + " bache daram az " + shahremahle);
        out.println("pedar ast " + esmepedar);


        out.println("payan ejra");

    }

}
