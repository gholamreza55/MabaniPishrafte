package khodro;

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

    public void prntRefrence() {
        System.out.println(this.toString());
    }
    public void printRefrenceObject(Object o) {
        System.out.println(o);
    }
    public void printRefrenceObject(String Object, int newParam) {
        System.out.println(Object);
    }
//    public String printRefrenceObject(String Object, int newParam) {
//        return "";
//    }
}
