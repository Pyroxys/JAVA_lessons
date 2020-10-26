// La classe Grille 

public class Grille {
	//Attributs
	private Bateau[] flotte = new Bateau[5]; // On créer la variable flotte qui prend un tableau d'element Bateau ou l'on vas stocker nos bateaux (5 bateaux)
	private int nbBateau = 0;
	
	// Ici la fonction placerBateau vas nous permettre de placer le bateau que l'on a chosis (porteAvion par exemple) 
	// en lui donnant en parametres la classe Bateau pour pouvoir créer le bateau (nom,taille, etc) qui à pour nom bateau 
	public void placerBateau(Bateau bateau, char lettre, int chiffre, char sens) {
		// Ensuite on appelle bateau pour le placer
		bateau.placerBateau(lettre, chiffre, sens);
		// On stock le nombre de bateau à placer 
		flotte[nbBateau] = bateau;
		// Et on incrémante nbBateau pour savoir combien de bateau on a placé
		nbBateau++;
	}
}
