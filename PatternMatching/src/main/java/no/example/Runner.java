package no.example;

public class Runner {
    public static double getOmkrets(Figur figur) throws IllegalArgumentException {
        if (figur instanceof Rektangel) {
            Rektangel s = (Rektangel) figur;
            return 2 * s.length() + 2 * s.width();
        } else if (figur instanceof Sirkel) {
            Sirkel s = (Sirkel) figur;
            return 2 * s.radius() * Math.PI;
        } else {
            throw new IllegalArgumentException("Unrecognized shape");
        }
    }

    public static void main(String[] args) {

        double perimeter = getOmkrets(new Sirkel(10));
        double areal = getOmkrets(new Rektangel(10, 5));
        System.out.println("omkrets = " + perimeter);
        System.out.println("omkrets = " + areal);
    }
}
