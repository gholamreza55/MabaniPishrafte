package khodro;

public abstract class Khodro  {
    @Override
    public String toString() {
        return "Khodro{}";
    }

    protected void protectedMethod() {
        System.out.println("This method is protected");
    }


    protected boolean ayaRoshanAst;

    public void roshan() {
        ayaRoshanAst = true;
    }

    void khamoush() {
        ayaRoshanAst = false;
    }

    public abstract boolean ayaDarHaleHarekatAst();

    public abstract String getmark();
}

