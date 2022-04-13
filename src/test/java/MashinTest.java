import org.junit.jupiter.api.Test;

public class MashinTest {

    class Mashin {



        boolean ayaMashinRoshanAst;
        boolean ayadarMashinBazAst;
        String mark;


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

        void harekat() {
            if (!ayadarMashinBazAst && ayaMashinRoshanAst){
                System.out.println("MashinDarHarekatAst");
            }else {
                System.out.println("Mashin Park ast");
            }
        }
    }
}
