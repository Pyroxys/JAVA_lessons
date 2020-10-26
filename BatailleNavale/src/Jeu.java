
public class Jeu {
	
	private Grille grilleJoueur1 = new Grille();
	private Grille grilleJoueur2 = new Grille();
	
	public void initialiser(int numJoueur, String nomBateau, int tailleBateau, char sens, char lettre, int chiffre ) {
		Bateau porteAvion = new Bateau(nomBateau, tailleBateau);
		
		if (numJoueur == 1) {
			grilleJoueur1.placerBateau(porteAvion, sens, lettre, chiffre);
		} else {
			grilleJoueur2.placerBateau(porteAvion, sens, lettre, chiffre);
		}
	}
	
	public String[] nomsBateaux() {
		String[] nomsBateaux = EnumNomBateau.enumToArray();
		return nomsBateaux;
	}
	
	
	public int nbElementBateau(String nomBateau) {
		int nbElement = 0;
		
		EnumNomBateau bateau = EnumNomBateau.stringToEnum(nomBateau);
		
		switch (bateau) {
		case PORTE_AVION:
			nbElement= 5;
			break;
		case CROISEUR:
			nbElement= 4;
			break;
		case SOUS_MARIN:
			nbElement= 3;
			break;
		case CONTRE_TORPILLEUR:
			nbElement= 3;
			break;
		default: //TORPILLEUR:
			nbElement= 2;
			break;
		}
		return nbElement;
	}
}
