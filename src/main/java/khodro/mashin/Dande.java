package khodro.mashin;

public enum Dande {
    AUTOMATIC("utomatic", "shahed", "toamrrican"),
    MANUAL("dasti", "adabo", "hossain");

    private final String toPersion;
    private final String tofrench;
    private final String toamrrican;


    Dande(String toPersion, String tofrench, String toamrrican) {
        this.toPersion = toPersion;
        this.tofrench = tofrench;
        this.toamrrican = toamrrican;
    }

    public static void print() {
        Dande[] values = Dande.values();
        for (int index = 0; index < values.length; index++) {
            System.out.println(values[index]);
        }
    }

    public static void printPERSION() {
        Dande[] values = Dande.values();
        for (int index = 0; index < values.length; index++) {
            Dande value = values[index];
            System.out.println(value.toPersion);
        }
    }

    public static void printfrench() {
        Dande[] values = Dande.values();
        for (int index = 0; index < values.length; index++) {
            Dande value = values[index];
            System.out.println(value.tofrench);
        }
    }
    public static void printamrrican() {
        Dande[] values = Dande.values();
        for (int index = 0; index < values.length; index++) {
            Dande value = values[index];
            System.out.println(value.toamrrican);
        }
    }
    public String ToPersion() {
        return toPersion;
    }

    public String Tofrench() {
        return tofrench;
    }

    public String getToamrrican() {
        return toamrrican;
    }
}
