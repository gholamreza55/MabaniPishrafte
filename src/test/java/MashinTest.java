import khodro.Khodro;
import khodro.Mashin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MashinTest {

    @Test
    void Mashin_bayad_harekat_konad_vaghty_dar_baste_ast_va_Mashin_roshan_ast() {

        Khodro benz = new Mashin("Benz");
        Khodro volvo = new Mashin("volvo");
        volvo.roshan();

        boolean ayaharekatMikonad = benz.ayaDarHaleHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMikonad = volvo.ayaDarHaleHarekatAst();

        assertFalse(ayaharekatMikonad);
        assertTrue(ayaVolvoHarekatMikonad);


    }



    }

