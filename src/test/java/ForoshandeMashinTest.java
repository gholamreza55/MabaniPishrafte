import foroshande.Foroshande;
import khodro.jadid.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForoshandeMashinTest {
    @Test
    void Bayad_Tedade_Kol_Mashin_Haye_Forokhte_Shode_Ra_Be_Dast_Avarim() {
        Foroshande Ali = new Foroshande();
        Foroshande naser = new Foroshande();
        Foroshande akbar = new Foroshande();

        Ali.forosheMashin();
        Ali.forosheMashin();
        Ali.forosheMashin();
        Ali.forosheMashin();
        naser.forosheMashin();
        akbar.forosheMashin();

        Assertions.assertEquals(6, Mashin.tedadeForosh);
    }
}