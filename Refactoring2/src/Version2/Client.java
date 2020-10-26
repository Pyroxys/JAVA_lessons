package Version2;
import java.util.Vector;
import java.util.Iterator;

public class Client {
	private String nom;
	private Vector locations = new Vector();
	
	public Client(String nom) {
		this.nom = nom;
	}
	
	public void addLocation(Location location) {
		this.locations.add(location);
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String situation() {
		double totalDu = 0;
		int pointsFidelites = 0;
		Iterator forEach = locations.iterator();
		String result = "Situation du client: " + getNom() + "<br>";
		
		while (forEach.hasNext()) {
			double du = 0;
			Location each = (Location) forEach.next();
			
			//determine le montant de chaque location
			switch (each.getFilm().getCodePrix()) {
			case Film.NORMAL:
				du += 2;
				if (each.getNbJours() > 2) 
					du += (each.getNbJours() - 2) * 1.5;
				break;
			case Film.NOUVEAUTE:
				du += each.getNbJours() * 3;
				break;
			case Film.ENFANT:
				du += 1.5;
				if (each.getNbJours() > 3)
					du += (each.getNbJours() - 3) * 1.5;
				break;
			case Film.COFFRET_SERIES_TV:
				du += (each.getNbJours() * 0.5);
				pointsFidelites--;
				break;
			case Film.CINEPHILE:
					du += 2;
					pointsFidelites += 2;
				if(each.getNbJours() > 1) {
					du = each.getNbJours() + 4;
					pointsFidelites -= 3;
				}
			}
			
			// ajout des points de fidelite
			pointsFidelites++;
			// ajout d'un bonus pour les nouveautes louees depuis au moins deux jours
			if ((each.getFilm().getCodePrix() == Film.NOUVEAUTE) && each.getNbJours() > 1) 
				pointsFidelites++;
			
			// mise en forme location
			result += "<p>" + each.getFilm().getTitre() + "</p>" + String.valueOf(du) + "<br>";
			totalDu += du;
		}
		
		// ajout recapitulatif client
		result += "Total du " + String.valueOf(totalDu) + "<br>";
		result += "Vous gagnez " + String.valueOf(pointsFidelites) + " points de fidelite<br>";
		
		return result;
	}

}