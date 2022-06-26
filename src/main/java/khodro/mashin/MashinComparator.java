package khodro.mashin;

import khodro.Mashin;

import java.util.Comparator;

public class MashinComparator implements Comparator<Mashin> {
    @Override
    public int compare(Mashin mashin1, Mashin mashin2) {
        return mashin1.getmark().compareTo(mashin2.getmark());
    }

}
