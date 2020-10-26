package Version3;

public class PrixNouveaute extends Prix {

	@Override
	double getMontant(Location location) {
		double du = 0;
		du += location.getNbJours() * 3;
		return du;
	}

	@Override
	int getPointsFidelites(Location location) {
		int pointsFidelite = 0;
		pointsFidelite++;
		
		// ajout d'un bonus pour les nouveautes louees depuis au moins deux jours
		if (location.getNbJours() > 1) {
			pointsFidelite++;
		}
		return pointsFidelite;
	}

}
