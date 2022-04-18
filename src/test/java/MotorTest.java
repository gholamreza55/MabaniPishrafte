import khodro.Khodro;
import khodro.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MotorTest {
    @Test
    void Motor_Bayad_harekat_konad_vagty_Roshan_ast() {

        Khodro motor = new Motor();


        motor.roshan();
        boolean ayaharekatMikonad = motor.ayaDarHaleHarekatAst();

        assertTrue(ayaharekatMikonad);
    }
}
