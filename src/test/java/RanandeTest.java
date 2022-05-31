import khodro.Ranande;
import org.junit.jupiter.api.Test;

public class RanandeTest {
    @Test
    void Bayad_noegvahi_nam() {
        Ranande ranande = new Ranande();

        Ranande.Gavahi gavahi = ranande.new Gavahi();
        gavahi.print();
    }

    @Test
    void Bayad_nam() {
        Ranande.Staticgavahi staticgavahi = new Ranande.Staticgavahi();
      //  Ranande.Staticgavahi staticgavahi = new Ranande.Staticgavahi();
        staticgavahi.print();
    }
}
