
public class Studies {
	public static void main(String[] args) {
		
		/*
		    Les variables doivent prendre un Type ( int pour les nombres, String pour les chaines de caract�res ou des booleans etc...) :
		  - Un nom 
		  - Et on peut leur affecter des valeurs 
		  - Exemple 1  : int monNombreEntier = 9;
		  - Exemple 2  : String maChaineDeCaracteres = "Hello World";
		  - Exemple 3  : boolean jeSuisVraieOuFaux = true;
		  
		  String = texte
		  int = nombre entier
		  double = nombre en virgule flottante 
		  boolean = variable qui peut etre vraie ou fausse 
		  
		*/
		
		// VARIABLES CLASSQIUE  
		
		int monNombreEntier = 9;
		String maChaineDeCaracteres = "Hello World";
		boolean jeSuisVraieOuFaux = true;
		
		//System.out.println(monNombreEntier);
		//System.out.println(maChaineDeCaracteres);
		//System.out.println(jeSuisVraieOuFaux);
		
		// VARIABLES CONSTANTES 
		
		final int numberOfWeekdays = 7;
		final String myFavouriteFood = "Icecream";
		
		// OPERATION EXEMPLES
		
		int p1 = 500;
		int p2 = 250;
		
		// VARIABLES CONSTANTES 
		final int p4 = 2;
		final int p5 = 5;
	
		// On ajoute 100 � la variable p1
		p1 = p1 + 100;
		//System.out.println(p1);
		
		// On enleve 50 � la variable p2
		p2 = p2 - 50;
		//System.out.println(p2);
		
		// On d�clare la variable p3 qui sera le r�sultat de 600 * 200 / 2
		int p3 = (p1 * p2) / 2;
		//System.out.println(p3);
		
		//System.out.println(p4);
		
		/* 

		+=  addition ;

		-=  soustraction ;
		
		*=  multiplication ;
		
		/=  division.
		 
		 Pour une pr�cision jusqu'� 7 d�cimales apr�s la virgule, il faut utiliser  float.  Au-del�, ce sera  double.


		*/
		
		float nbrDecimalCour = (float) 1876.79;
		double nbrDecimalLong = 1876.79797657;
		
		//System.out.println(nbrDecimalCour);
		//System.out.println(nbrDecimalLong);
		
		int a = 10;
		int b = 4;
		int c = a/b;
		
		System.out.println(c);
		
		// Une division entre deux entiers s'appelle une division enti�re. Elle a toujours pour r�sultat un nombre entier.
		
		int x = 10;
		int y = 4;
		double r = x/y;
		
		System.out.println(r);
		
		// R va pouvoir stocker un nombre d�cimal mais X et Y on �tait d�clarer comme nombre entier donc cela ne fonctionne toujours pas 
		
		
		int j = 10;
		int g = 4;
		double o = j/(double) g; //-> O contient 2.5, car la valeur de G est transform�e en double
		
		System.out.println(o);
		
														// LES STRINGS ( cha�nes de caract�res ) 
		
		String ville = "Toronto";
		String serie = "The Last Kingdom";
		String animal; 
		String chaineVide = ""; // Variable que l'on pourra remplire plus tard, sert juste a d�clarer que emptyString contiendra un String 
		
		//System.out.println("Je vis � " + ville + " j'adore " + serie + "." );
		
		
		
														// LES CLASSE 
		
		//  les classes mod�les qui sont utilis�es comme mod�les pour l'instanciation des objets,

		//  les classes utilitaires qui contiennent des fonctions statiques qui peuvent �tre appel�es directement sur la classe ;
		
		//  Ceci est une classe : public class Studies { }
	
		//  Ceci est une fonction : public static void main(String[] args) { }
		
		// public : visible pour tous et par cons�quent le moins restrictif ;

		// protected (prot�g�) : visible pour le package et l'ensemble de ses sous-classes ;

		// package-protected (prot�g� par paquet) : g�n�ralement visible uniquement par le package dans lequel il se trouve (param�tres par d�faut) ;

		// private (priv�) : accessible uniquement dans le contexte dans lequel les variables sont d�finies (� l'int�rieur de la classe dans laquelle il est situ�).
		
		/*
		 
		class PrivateClass {
		    int internalProperty = 0; // assigne automatiquement package-private par d�faut
		    protected defaultProperty = true; // assigne automatiquement package-private 
		    public boolean publicProperty = true; // convertit automatiquement en package-private 
		    private String fileprivateProperty = "Hello!"; //disponible seulement pour la classe
		    private static void privateMethod() {
		    }
		}
		
		*/
		
														// LES BOUCLES 
		
		// La boucle FOR : 
		
		//for (// point de d�part ; condition; changer le d�part) {
			// liste de d�clarations
			//}
	
		// EXEMPLE : 
		
		//for (int nombre = 0; nombre <= 100; nombre++) {
			//System.out.println(nombre);
		//}
		
		// La boucle WHILE : 
		
		/*
		Dans une boucle while on va v�rifier si une condition est VRAI au FAUX, 
		tant que la condition est vrai, on reste dans la boucle, une fois que la condition est fausse on sort
		*/
		
		//La condition est VRAI tant que notre nombre est sup�rieur � 0
		
		/*
		int nombre = 100;
		
		while (nombre >= 0) {
			System.out.println(nombre);
				nombre--;
		}
		*/
		
		// La boucle DO :
		
		/*
		Alors la boucle DO c�est la m�me chose que la boucle While sauf que le code va se lancer au moins 1fois et 
		� la fin le code va contr�ler si la condition est vrai si c�est le cas alors on lance la boucle sinon on sort.
		*/
		
		int nombre = 0;
		
		do {
			System.out.println(nombre++);
		} while (nombre <= 100);
		
	}
	
	
	
	
	
	
	



}
