import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathTest {

    @Test
    void Bayad_Amaliat_Riazi_Anjam_Dahad() {
        double motaghayer = -1.5;
        int varibel = 0;

        double meghdareMotlagh = Math.abs(motaghayer);

        assertEquals(1.5, meghdareMotlagh);
        assertEquals(1, Math.cos(0));
        assertEquals(0, Math.sin(0));
    }
}
