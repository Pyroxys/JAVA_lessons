
public class Bateau {
	// Attributs
	private String nom;
	private int tailleBateau;
	private char etatBateau = 'S';
	private Element[] bateau;
	
	// Constructeur
	public Bateau(String nom, int tailleBateau) {
		super();
		this.nom = nom;
		this.tailleBateau = tailleBateau;
		bateau = new Element[tailleBateau];
	}
	
	public void placerBateau(char lettre, int chiffre, char sens) {
		if(sens == 'H') {
			for (int i = 0; i < tailleBateau ; i++) {
				bateau[i] = new Element(lettre, chiffre +i);
			}
		}else {
			for (int i = 0; i < tailleBateau ; i++) {
				bateau[i] = new Element((char)(lettre +i), chiffre);
			}
		}
	}
	public char getEtatBateau() {
		return etatBateau;
	}
	
	public int getTailleBateau() {
		return tailleBateau;
	}
	
//	public boolean appartientBateau(char lettre, int chiffre) {
//		boolean appartientBateau = false;
//		boolean appartient = false;
//		
//		for (int i = 0; i < tailleBateau; i++) {
//			
//			appartient = bateau[i].verifierCoordonnee(lettre, chiffre);
//			
//			if (appartient) {
//				appartientBateau = appartient;
//			}
//		}
//		
//		return appartientBateau;
//	}
//	

	public boolean appartientBateau(char lettre, int chiffre) {
		boolean appartientBateau = false;
		
		for (int i = 0; i < tailleBateau && !appartientBateau; i++) {		
			appartientBateau = bateau[i].verifierCoordonnee(lettre, chiffre);
		}
		
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
