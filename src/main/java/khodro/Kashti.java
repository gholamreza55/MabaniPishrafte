package khodro;

import khodro.jadid.Mashin;

public class Kashti extends Khodro {

    @Override
    public String toString() {
       // return "Kashti{}";
        return super.toString();
    }

    @Override
    protected void protectedMethod() {
        System.out.println("we are a kashti");

    }

    @Override
    public boolean ayaDarHaleHarekatAst() {
        protectedMethod();
        return false;
    }

    @Override
    public String getmark() {
        return "khodro.Kashti";
    }
}
