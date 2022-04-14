import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MashinTest {

    @Test
    void Mashin_bayad_harekat_konad_vaghty_dar_baste_ast_va_Mashin_roshan_ast() {

        Mashin benz = new Mashin("Benz");
        Mashin volvo = new Mashin("volvo");

        boolean ayaharekatMikonad = benz.ayaMashinDarHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMikonad = volvo.ayaMashinDarHarekatAst();

        assertFalse(ayaharekatMikonad);
        assertTrue(ayaVolvoHarekatMikonad);


//        Mashin mashin = new Mashin();
//        mashin.bazKardandar();
//        mashin.bastanDar();
//        mashin.harekat();
//
//        System.out.println("Dar Mashin baz ast ?" + mashin.ayadarMashinBazAst);
//
//        System.out.println("------------");
//
//        Mashin pride = new Mashin("Pride");
//        pride.roshan();
//        pride.bazKardandar();
//        pride.harekat();

    }

    class Mashin {
        boolean ayaMashinRoshanAst;   //pish farz false ast
        boolean ayadarMashinBazAst;   //pish farz false ast
        String mark;



        Mashin() {
            System.out.println("Yek Mashin bedone Dade Sakhte Shod");
        }
        Mashin(String mark) {
            this.mark = mark;
            System.out.println("Yek mashin " + this.mark + " sakhte shod");
        }

        void roshan() {
            System.out.println("Mashin roshan ast");
            ayaMashinRoshanAst = true;
        }

        void khamoush() {
            System.out.println("Mashin khamoush ast");
            ayaMashinRoshanAst = false;
        }

        void bazKardandar() {
            System.out.println("Dar Baz ast");
            ayadarMashinBazAst = true;
        }

        void bastanDar() {
            System.out.println("Dar Baste shod");
            ayadarMashinBazAst = false;
        }

        boolean ayaMashinDarHarekatAst() {
            if (!ayadarMashinBazAst && ayaMashinRoshanAst){
                System.out.println("MashinDarHarekatAst");
                return true;
            }else {
                System.out.println("Mashin Park ast");
                return false;
            }
        }
    }
}
