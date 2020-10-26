// La classe Bateau 

public class Bateau {
	// Attributs de la classe bateau
	private String nom;
	private int tailleBateau;
	private char etatBateau = 'S';
	private Element[] bateau; // On créer un tableau d'élement que l'on nomme bateau, il contiendra les bateaux que l'on vas créer 
	
	// Constructeur de la classe Bateau 
	public Bateau(String nom, int tailleBateau) {
		this.nom = nom;
		this.tailleBateau = tailleBateau;
		this.bateau = new Element[tailleBateau]; // On créer un objet bateau à qui on donne l'element tailleBateau qui est dans un tableau 
	}
	
	public void placerBateau(char lettre, int chiffre, char sens) {
		// Si le sens == à l'horizontal alors :
		if (sens == 'H') {
			// On itére sur l'attribut tailleBateau et on créer sa position donc Horizontal 
			for (int i = 0; i < tailleBateau; i++) {
				bateau[i] = new Element(lettre, chiffre +i);
			}
		}else {
			// On itére sur l'attribut tailleBateau et on créer sa position donc Vertical 
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
	
	// Fonction qui nous indique si un bateau (le torpilleur) à était touché 
	public boolean appartientBateau(char lettre, int chiffre) {
		boolean appartientBateau = false; // On créer un boolean qui a pour nom appartientBateau et qu'on instantie à false
		
		// Tant que i est inférieur à la taille du bateau et different de appartientBateau alors : 
		for (int i = 0; i < tailleBateau && !appartientBateau; i++) {
			// On vérifie dans le tableau les coordonnees rentrer pas le joueur 
			appartientBateau = bateau[i].verifierCoordonnee(lettre, chiffre);
		}
		// On retourne appartientBateau pour récuperer les coordonnees 
		return appartientBateau;
		
	}
	
	public static void main(String[] args) {     
		Bateau torpilleur = new Bateau("torpilleur", 2);     
		torpilleur.placerBateau('A', 1, 'H');     
		System.out.println("Le torpilleur a-t-il un élément en 'A',2 ? "        
		+ torpilleur.appartientBateau('A', 2));     
		System.out.println("Le torpilleur a-t-il un élément en 'B',2 ? "       
		 + torpilleur.appartientBateau('B', 2));     
		System.out.println("L'état du torpilleur est : "       
		 + torpilleur.getEtatBateau());   
	}
}
