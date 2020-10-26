
public class Studies {
	public static void main(String[] args) {
		
		/*
		    Les variables doivent prendre un Type ( int pour les nombres, String pour les chaines de caractères ou des booleans etc...) :
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
	
		// On ajoute 100 à la variable p1
		p1 = p1 + 100;
		//System.out.println(p1);
		
		// On enleve 50 à la variable p2
		p2 = p2 - 50;
		//System.out.println(p2);
		
		// On déclare la variable p3 qui sera le résultat de 600 * 200 / 2
		int p3 = (p1 * p2) / 2;
		//System.out.println(p3);
		
		//System.out.println(p4);
		
		/* 

		+=  addition ;

		-=  soustraction ;
		
		*=  multiplication ;
		
		/=  division.
		 
		 Pour une précision jusqu'à 7 décimales après la virgule, il faut utiliser  float.  Au-delà, ce sera  double.


		*/
		
		float nbrDecimalCour = (float) 1876.79;
		double nbrDecimalLong = 1876.79797657;
		
		//System.out.println(nbrDecimalCour);
		//System.out.println(nbrDecimalLong);
		
		int a = 10;
		int b = 4;
		int c = a/b;
		
		System.out.println(c);
		
		// Une division entre deux entiers s'appelle une division entière. Elle a toujours pour résultat un nombre entier.
		
		int x = 10;
		int y = 4;
		double r = x/y;
		
		System.out.println(r);
		
		// R va pouvoir stocker un nombre décimal mais X et Y on était déclarer comme nombre entier donc cela ne fonctionne toujours pas 
		
		
		int j = 10;
		int g = 4;
		double o = j/(double) g; //-> O contient 2.5, car la valeur de G est transformée en double
		
		System.out.println(o);
		
														// LES STRINGS ( chaînes de caractères ) 
		
		String ville = "Toronto";
		String serie = "The Last Kingdom";
		String animal; 
		String chaineVide = ""; // Variable que l'on pourra remplire plus tard, sert juste a déclarer que emptyString contiendra un String 
		
		//System.out.println("Je vis à " + ville + " j'adore " + serie + "." );
		
		
		
														// LES CLASSE 
		
		//  les classes modèles qui sont utilisées comme modèles pour l'instanciation des objets,

		//  les classes utilitaires qui contiennent des fonctions statiques qui peuvent être appelées directement sur la classe ;
		
		//  Ceci est une classe : public class Studies { }
	
		//  Ceci est une fonction : public static void main(String[] args) { }
		
		// public : visible pour tous et par conséquent le moins restrictif ;

		// protected (protégé) : visible pour le package et l'ensemble de ses sous-classes ;

		// package-protected (protégé par paquet) : généralement visible uniquement par le package dans lequel il se trouve (paramètres par défaut) ;

		// private (privé) : accessible uniquement dans le contexte dans lequel les variables sont définies (à l'intérieur de la classe dans laquelle il est situé).
		
		/*
		 
		class PrivateClass {
		    int internalProperty = 0; // assigne automatiquement package-private par défaut
		    protected defaultProperty = true; // assigne automatiquement package-private 
		    public boolean publicProperty = true; // convertit automatiquement en package-private 
		    private String fileprivateProperty = "Hello!"; //disponible seulement pour la classe
		    private static void privateMethod() {
		    }
		}
		
		*/
		
														// LES BOUCLES 
		
		// La boucle FOR : 
		
		//for (// point de départ ; condition; changer le départ) {
			// liste de déclarations
			//}
	
		// EXEMPLE : 
		
		//for (int nombre = 0; nombre <= 100; nombre++) {
			//System.out.println(nombre);
		//}
		
		// La boucle WHILE : 
		
		/*
		Dans une boucle while on va vérifier si une condition est VRAI au FAUX, 
		tant que la condition est vrai, on reste dans la boucle, une fois que la condition est fausse on sort
		*/
		
		//La condition est VRAI tant que notre nombre est supérieur à 0
		
		/*
		int nombre = 100;
		
		while (nombre >= 0) {
			System.out.println(nombre);
				nombre--;
		}
		*/
		
		// La boucle DO :
		
		/*
		Alors la boucle DO c’est la même chose que la boucle While sauf que le code va se lancer au moins 1fois et 
		à la fin le code va contrôler si la condition est vrai si c’est le cas alors on lance la boucle sinon on sort.
		*/
		
		int nombre = 0;
		
		do {
			System.out.println(nombre++);
		} while (nombre <= 100);
		
	}
	
	
	
	
	
	
	



}
