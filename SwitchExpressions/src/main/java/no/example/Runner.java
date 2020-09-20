package no.example;

public class Runner {
    public static void main(String[] args) {
        Dag day = Dag.ONSDAG;
        System.out.println(
                switch (day) {
                    case MANDAG, FREDAG, SØNDAG -> 6;
                    case TIRSDAG -> 7;
                    case TORSDAG, LØRDAG -> 8;
                    case ONSDAG -> 9;
                    default -> throw new IllegalStateException("Invalid day: " + day);
                }
        );
    }
}
