package Version3;

public class PrixNormal extends Prix {

	@Override
	double getMontant(Location location) {
		double du = 0;
		du += 2;
		if (location.getNbJours() > 2) {
			du += (location.getNbJours() - 2) * 1.5;
		}
		return du;
	}

	@Override
	int getPointsFidelites(Location location) {
		int pointsFidelite = 0;
		return ++pointsFidelite;
	}

}
