package khodro;

import khodro.Kashti;
import khodro.Khodro;
import khodro.mashin.Dande;
import khodro.Mashin;
import org.junit.jupiter.api.Test;

public class KashtiTest {



    @Test
    void protected_method() {
        Khodro kashti = new Kashti();

        kashti.ayaDarHaleHarekatAst();

    }

    @Test
    void super_keword() {
        Khodro kashti = new Kashti();
        Khodro kashti1 = new Kashti();

        System.out.println(kashti1.toString());
        System.out.println(kashti.toString());
    }

    @Test
    void this_keword() {
        Kashti kashti = new Kashti();
        Mashin mashin = new Mashin("zhian", 25 , Dande.MANUAL);
        kashti.prntRefrence();
        kashti.printRefrenceObject(this);
        kashti.printRefrenceObject(mashin);
    }


}
