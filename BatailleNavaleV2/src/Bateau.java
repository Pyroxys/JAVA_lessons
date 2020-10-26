// La classe Bateau 

public class Bateau {
	// Attributs de la classe bateau
	private String nom;
	private int tailleBateau;
	private char etatBateau = 'S';
	private Element[] bateau; // On cr�er un tableau d'�lement que l'on nomme bateau, il contiendra les bateaux que l'on vas cr�er 
	
	// Constructeur de la classe Bateau 
	public Bateau(String nom, int tailleBateau) {
		this.nom = nom;
		this.tailleBateau = tailleBateau;
		this.bateau = new Element[tailleBateau]; // On cr�er un objet bateau � qui on donne l'element tailleBateau qui est dans un tableau 
	}
	
	public void placerBateau(char lettre, int chiffre, char sens) {
		// Si le sens == � l'horizontal alors :
		if (sens == 'H') {
			// On it�re sur l'attribut tailleBateau et on cr�er sa position donc Horizontal 
			for (int i = 0; i < tailleBateau; i++) {
				bateau[i] = new Element(lettre, chiffre +i);
			}
		}else {
			// On it�re sur l'attribut tailleBateau et on cr�er sa position donc Vertical 
			for (int i = 0; i < tailleBateau; i++) {
				bateau[i] = new Element((char)(lettre +i), chiffre);
			}
		}
	}
	
	// Le getter getTailleBateau vas permettre de stocker la taille du bateau 
	public int getTailleBateau() {
		return tailleBateau;
	}

	// Le getter getEtatBateau vas permettre de stocker l'etat du bateau bateau 
	public char getEtatBateau() {
		return etatBateau;
	}
	
	// Fonction qui nous indique si un bateau (le torpilleur) � �tait touch� 
	public boolean appartientBateau(char lettre, int chiffre) {
		boolean appartientBateau = false; // On cr�er un boolean qui a pour nom appartientBateau et qu'on instantie � false
		
		// Tant que i est inf�rieur � la taille du bateau et different de appartientBateau alors : 
		for (int i = 0; i < tailleBateau && !appartientBateau; i++) {
			// On v�rifie dans le tableau les coordonnees rentrer pas le joueur 
			appartientBateau = bateau[i].verifierCoordonnee(lettre, chiffre);
		}
		// On retourne appartientBateau pour r�cuperer les coordonnees 
		return appartientBateau;
		
	}
	
	public static void main(String[] args) {     
		Bateau torpilleur = new Bateau("torpilleur", 2);     
		torpilleur.placerBateau('A', 1, 'H');     
		System.out.println("Le torpilleur a-t-il un �l�ment en 'A',2 ? "        
		+ torpilleur.appartientBateau('A', 2));     
		System.out.println("Le torpilleur a-t-il un �l�ment en 'B',2 ? "       
		 + torpilleur.appartientBateau('B', 2));     
		System.out.println("L'�tat du torpilleur est : "       
		 + torpilleur.getEtatBateau());   
	}
}
