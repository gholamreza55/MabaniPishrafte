package khodro;

import foroshande.Foroshande;
import khodro.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForoshandeMashinTest {
    @Test
    void Bayad_Tedade_Kol_Mashin_Haye_Forokhte_Shode_Ra_Be_Dast_Avarim() {
      Foroshande f = new Foroshande();
      f.forosheMashin();

      Foroshande s = new Foroshande();
      





        Assertions.assertEquals(1, Mashin.tedadeForosh);
    }
}