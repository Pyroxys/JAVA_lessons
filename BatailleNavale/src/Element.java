// La classe Element 

public class Element {
	//attributs 
	private char lettre;
	private int chiffre;
	private boolean elementTouche = false;


	public Element(char lettre, int chiffre) {
		this.lettre = lettre;
		this.chiffre = chiffre;
	}
	
	public boolean isElementTouche() {
		return this.elementTouche;
	}
	
	public boolean verifierCoordonnee(char lettre, int chiffre) {
		return (this.lettre == lettre && this.chiffre == chiffre);
	}
	
	public void touche() {
		this.elementTouche = true;
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

