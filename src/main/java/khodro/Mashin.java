package khodro.mashin;
import khodro.Gearbox;
import khodro.Khodro;
import khodro.Ranande;
import khodro.SandoghDar;
public class Mashin extends Khodro implements SandoghDar, Gearbox {
            public static int tedadeForosh;
            private boolean ayadarBazAst;   //pish farz false ast
            private String mark;
            private int gonjayeshSandogh;
            private Dande noeDande;
            private Ranande ranande;
            public Mashin() {
            }
            public Mashin(String mark) {
                this.mark = mark;
            }
            public Mashin(String mark, int gonjayeshSandogh, Dande noeDande) {
                this.mark = mark;
                this.gonjayeshSandogh = gonjayeshSandogh;
                this.noeDande = noeDande;
             }
             void bazKardandar() {
                ayadarBazAst = true;
            }
            void bastanDar() {
                ayadarBazAst = false;
            }
            public boolean ayaDarHaleHarekatAst() {
                protectedMethod();
                if (!ayadarBazAst && ayaRoshanAst) {
                    return true;
                } else {
                    return false;
             }
            }
            @Override
            public String getmark() {
                return mark;
            }
            @Override
            public Dande typeDande() {
                return Dande.valueOf("noeDande");
            }
            @Override
            public int gonjayeshSandogh() {
                return gonjayeshSandogh;
              }
    @Override
    public String toString() {
        return "Mashin{" +
                "ayadarBazAst=" +this.ayadarBazAst +
                ", mark='" + this.mark + '\'' +
                ", gonjayeshSandogh=" + this.gonjayeshSandogh +
                ", noeDande='" + this.noeDande + '\'' +
                ", ranande=" + this.ranande +
                '}';
    }
}


