package khodro;

public class Mashin extends Khodro {

            boolean ayadarBazAst;   //pish farz false ast
            String mark;
            Ranande ranande;

            public Mashin() {

            }

            public Mashin(String mark) {
                this.mark = mark;

            }

            void bazKardandar() {

                ayadarBazAst = true;
            }

            void bastanDar() {

                ayadarBazAst = false;
            }

            public boolean ayaDarHaleHarekatAst() {
                if (!ayadarBazAst && ayaRoshanAst) {

                    return true;
                } else {

                    return false;
                }
            }

}


