import khodro.*;
import khodro.jadid.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NamKhodrochaKonTest {

    @Test
    void Bayad_Nam_Khodro_Ra_Chap_Konad() {
        Khodro benz = new Mashin("Benz", 120, "Automatic");
        Khodro volvo = new Mashin("Volvo", 80, "Dasti");
        Khodro motor = new Motor();
        Khodro kashti = new Kashti();
        Khodro[] khodroha = {benz, volvo, motor, kashti};
        NamKhodroChapKon namKhodroChapKon = new NamKhodroChapKon(khodroha);
        String listNamKhodroha = namKhodroChapKon.excute();
        Assertions.assertEquals("Benz-Volvo-Motor-khodro.Kashti",listNamKhodroha);

    }
}
