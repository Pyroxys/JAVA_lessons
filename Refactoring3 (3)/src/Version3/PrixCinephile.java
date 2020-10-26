package Version3;

public class PrixCinephile extends Prix {
	
	@Override
	double getMontant(Location location) {
		double du = 2;
		
	if(location.getNbJours() > 1) {
		du = location.getNbJours() + 4;
	}
		return du;
	}

	@Override
	int getPointsFidelites(Location location) {
		int pointsFidelite = 3;
		if(location.getNbJours() > 1) {
			pointsFidelite -= 3;
	}
		return pointsFidelite;
	}
	
}