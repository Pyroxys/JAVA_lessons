package Version3;

public class PrixEnfant extends Prix {

    public double getMontant(Location location) {
        double du = 0;
        du += 1.5;
        if (location.getNbJours() > 3) {
            du += (location.getNbJours() - 3) * 1.5;
        }
        return du;
    }

    public int getPointsFidelite(Location location) {
        int pointsFidelite = 0;
        return ++pointsFidelite;
    }
}
