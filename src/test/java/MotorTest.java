import khodro.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MotorTest {
    @Test
    void Motor_Bayad_harekat_konad_vagty_dar_baste_ast_va_Mashin_Roshan_ast() {

        Motor motor = new Motor();
        motor.roshan();
        boolean ayaharekatMikonad = motor.ayaDarHaleHarekatAst();

        assertTrue(ayaharekatMikonad);
    }
}
