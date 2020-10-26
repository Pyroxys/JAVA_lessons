// La classe Element 

public class Element {
	// Attributs
	private char lettre;
	private int chiffre;
	private boolean elemenTouche = false;
	
	// Constructeur de la classe Element 
	public Element(char lettre, int chiffre) {
		// This est utilis� pour distinguer les parametres String lettre et int chiffre des attributs que l'on appelle 
		this.lettre = lettre;
		this.chiffre = chiffre;
	}
	
	public boolean isElementTouche() {
		return this.elemenTouche;
		
	}
	
	public boolean verifierCoordonnee(char lettre, int chiffre) {
		return (this.lettre == lettre && this.chiffre == chiffre);
		
	}
	
	public void touche() {
		this.elemenTouche = true;
	}
	
	public static void main(String[] args) {
		 Element element = new Element('B', 3);
		 System.out.println("L'�l�ment a-t-il pour coordonn�e ('A',3) ? "
		 + element.verifierCoordonnee('A', 3));
		 System.out.println("L'�l�ment a-t-il pour coordonn�e ('B',3) ? "        
		 + element.verifierCoordonnee('B', 3));
		 System.out.println("L'�l�ment est-il touch� ? "        
		 + element.isElementTouche());
		 System.out.println("Attaque de l'�l�ment");     
		 element.touche();
		 System.out.println("L'�l�ment est-il touch� ? "        
		 + element.isElementTouche()); 
	}	
}
