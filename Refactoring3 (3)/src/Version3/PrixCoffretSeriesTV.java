package Version3;

public class PrixCoffretSeriesTV extends Prix {

	@Override
	double getMontant(Location location) {
		double du = 0;
		du += (location.getNbJours() * 0.5);
		return du;
	}

	@Override
	int getPointsFidelites(Location location) {
		return 0;
	}

}
