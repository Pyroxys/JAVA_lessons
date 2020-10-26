// La classe Jeu 

public class Jeu {
	
	private Grille grilleJoueur1 = new Grille();
	private Grille grilleJoueur2 = new Grille();
	
	// Fonction initialiser qui permet de cr�er les bateaux avec le num�ro du joueur, le nom du bateau, sa taille, la lettre qui nous indique son etat
	// le chiffre pour le placer sur la grille et le sens du bateau sur la grille (Horizontal ou Vertical)
	public void initialiser(int numJoueur, String nomBateau, int tailleBateau, char lettre, int chiffre, char sens) {
		// On cr�er l'�lement porteAvion grace au constructeur de Bateau de la classe Bateau avec les parametres suivant :
		// nom (nomBateau) et sa taille (tailleBateau) 
		Bateau porteAvion = new Bateau(nomBateau, tailleBateau); // On cr�er notre bateau avec son nom (porteAvion) et �a taille 
		
		// Si le joueur est �gale a 1 alors on place son bateau sur la grille a la coordonnes indiqu� exemple H, 8 
		if (numJoueur == 1) {
			grilleJoueur1.placerBateau(porteAvion, lettre, chiffre, sens);
		// Sinon c'est le bateau du joueur 2 qui est plac�
		}else {
			grilleJoueur2.placerBateau(porteAvion, lettre, chiffre, sens);
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
