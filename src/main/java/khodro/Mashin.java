package khodro;
import khodro.mashin.Dande;
import java.util.Objects;
public class Mashin extends Khodro implements SandoghDar, Gearbox, Comparable<Mashin>{
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
                ", noeDande='" + this.noeDande.ToPersion() + "-" + this.noeDande.Tofrench() + '\''
                +this.noeDande.Tofrench() + '\'' +
                ", ranande=" + this.ranande +
                '}';
    }
            @Override
            public boolean equals(Object o) {
            if (this == o)
             return true;
            if (o == null || getClass() != o.getClass())
             return false;
            Mashin mashin = (Mashin) o;
             return gonjayeshSandogh == mashin.gonjayeshSandogh
                && Objects.equals(mark, mashin.mark)
                && noeDande == mashin.noeDande;
    }
    @Override
    public int hashCode() {
        return Objects.hash(mark, gonjayeshSandogh, noeDande);
    }

    @Override
    public int compareTo(Mashin mashinDighar) {
        int moghayesheGonjayeshSndoug =
                Integer.compare(this.gonjayeshSandogh, mashinDighar.gonjayeshSandogh);
        if (moghayesheGonjayeshSndoug == 0) {

        }
        return moghayesheGonjayeshSndoug;
    }
}


