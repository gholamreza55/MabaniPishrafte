package khodro;

public class NamKhodroChapKon {

    Khodro[] khodroha;
    public NamKhodroChapKon(Khodro[] khodroha) {
        this.khodroha = khodroha;

    }

    public String excute() {
        String nameKhodroha = "";
        for ( int neshanghar = 0; neshanghar < khodroha.length; neshanghar++) {
            Khodro khodro = khodroha[neshanghar];
            if (neshanghar != khodroha.length - 1) {
                nameKhodroha = nameKhodroha + khodro.getmark() + "-";

        } else {
                nameKhodroha = nameKhodroha + khodro.getmark();

            }
          }


        return nameKhodroha;
    }
}
