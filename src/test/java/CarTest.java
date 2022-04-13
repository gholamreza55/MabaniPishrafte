import org.junit.jupiter.api.Test;

public class CarTest {

    class Car {
        Boolean AyaCarRoshanAst;
        Boolean AyaCarBazAst;
        double toul;
        double arz;
        String mark;


        void roshan() {
            System.out.println("Car roshan Ast");
            AyaCarRoshanAst = true;
        }

        void Khamoush() {
            System.out.println("Car Khamoush Ast");
            AyaCarRoshanAst = false;
        }

        void bazkardanDar() {
            System.out.println("Dar Baz Ast");
            AyaCarBazAst = true;
        }

        void bastanDar () {
            System.out.println("Dar Baste Ast");
            AyaCarBazAst = false;
        }

        void harakat() {
            if (!AyaCarBazAst && AyaCarRoshanAst) {
                System.out.println("CarDarHaleHarekatAst");

            }else {
                System.out.println("Car Park Ast");
            }

        }

    }

}
