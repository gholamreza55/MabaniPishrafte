package khodro;

public class Mashin {

    boolean ayaRoshanAst;   //pish farz false ast
    boolean ayadarBazAst;   //pish farz false ast
    String mark;
    Ranande ranande;

    public Mashin() {

    }
    public Mashin(String mark) {
        this.mark = mark;

    }

    public void roshan() {

        ayaRoshanAst = true;
    }

    void khamoush() {

        ayaRoshanAst = false;
    }

    void bazKardandar() {

        ayadarBazAst = true;
    }

    void bastanDar() {

        ayadarBazAst = false;
    }

    public boolean ayaMashinDarHarekatAst() {
        if (!ayadarBazAst && ayaRoshanAst){

            return true;
        }else {

            return false;
        }
    }

}
