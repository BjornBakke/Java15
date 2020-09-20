package no.example;

public interface Figur {
}

final class Rektangel implements Figur {
    final double lengde;
    final double vidde;

    public Rektangel(double lengde, double vidde) {
        this.lengde = lengde;
        this.vidde = vidde;
    }

    double length() {
        return lengde;
    }

    double width() {
        return vidde;
    }
}

final class Sirkel implements Figur {
    final double radius;

    public Sirkel(double radius) {
        this.radius = radius;
    }

    double radius() {
        return radius;
    }
}
