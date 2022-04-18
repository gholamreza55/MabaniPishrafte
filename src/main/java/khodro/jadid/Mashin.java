package khodro.jadid;

import khodro.Gearbox;
import khodro.Khodro;
import khodro.Ranande;
import khodro.SandoghDar;

public class Mashin extends Khodro implements SandoghDar, Gearbox {

            private boolean ayadarBazAst;   //pish farz false ast
            private String mark;
            private int gonjayeshSandogh;
            private String noeDande;

            private Ranande ranande;

            public Mashin() {

            }

            public Mashin(String mark) {
                this.mark = mark;

            }

            public Mashin(String mark, int gonjayeshSandogh, String noeDande) {
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
            public String typeDande() {
                return "Automatic";
            }

            @Override
            public int gonjayeshSandogh() {
                return 100;
              }
            }


