package compareObject;

import khodro.Mashin;
import khodro.mashin.Dande;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static khodro.mashin.Dande.*;
public class CompareColletionTest {
    @Test
    void should_compare_non_hash() {
        List<Mashin> mashin = new ArrayList<>();
        mashin.add(new Mashin("benz", 15, MANUAL));

        List<Mashin> mashin2 = new ArrayList<>();
        mashin.add(new Mashin("benz", 15, MANUAL));
        System.out.println(mashin.equals(mashin2));
    }
    @Test
    void should_compare_hash() {
        Set<Mashin> mashin = new HashSet<>();
        mashin.add(new Mashin("benz", 15, MANUAL));

        Set<Mashin> mashin1 = new HashSet<>();
        mashin.add(new Mashin("benz", 15, MANUAL));

        System.out.println(mashin.equals(mashin1));
    }
}
