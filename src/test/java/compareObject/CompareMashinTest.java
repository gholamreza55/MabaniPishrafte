package compareObject;
import khodro.Mashin;
import khodro.mashin.MashinComparator;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static khodro.mashin.Dande.AUTOMATIC;
import static khodro.mashin.Dande.MANUAL;

public class CompareMashinTest {
    @Test
    void should_c0mpare_mashin() {
        Mashin bmw1 = new Mashin("BMW", 150, AUTOMATIC);
        Mashin bmw2 = new Mashin("BMW",150, AUTOMATIC);
        System.out.println(bmw1.equals(bmw2));
        System.out.println(bmw1 == bmw2);
    }
    @Test
    void should_sort_mashin() {
        Mashin bmw1 = new Mashin("BMW", 150, MANUAL);
        Mashin bmw2 = new Mashin("BMW",100, AUTOMATIC);
        Mashin bmw3 = new Mashin("BMW",50, MANUAL);
        Mashin bmw4 = new Mashin("BMW",50, AUTOMATIC);
        List<Mashin> mashins = new ArrayList<>();
        mashins.add(bmw1);
        mashins.add(bmw2);
        mashins.add(bmw3);
        mashins.add(bmw4);
        Collections.sort(mashins);
        List<Mashin> expectMashins = new ArrayList<>();
        expectMashins.add(bmw3);
        expectMashins.add(bmw4);
        expectMashins.add(bmw2);
        expectMashins.add(bmw1);
        System.out.println(mashins.equals(expectMashins));
    }
    @Test
    void should_sort_mashin_by_mark() {
        Mashin bmw = new Mashin("BMW", 150, MANUAL);
        Mashin mercedes = new Mashin("mercedes",100, AUTOMATIC);
        Mashin paykan = new Mashin("paykan",50, MANUAL);
        Mashin alfa = new Mashin("alfa",50, AUTOMATIC);
        List<Mashin> mashins = new ArrayList<>();
        mashins.add(alfa);
        mashins.add(bmw);
        mashins.add(mercedes);
        mashins.add(paykan);

        Collections.sort(mashins, new MashinComparator());

        List<Mashin> expectMashins = new ArrayList<>();
        expectMashins.add(alfa);
        expectMashins.add(bmw);
        expectMashins.add(mercedes);
        expectMashins.add(paykan);

        mashins.equals(expectMashins);
    }
}
