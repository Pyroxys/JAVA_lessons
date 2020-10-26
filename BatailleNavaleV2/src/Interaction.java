public class Interaction {
	private Clavier lecture = new Clavier();
	private Jeu jeu;
	
	public Interaction(Jeu pjeu) {
		jeu = pjeu;
		initialiser();
	}
	
	private void initialiser() {
		for (int i = 1; i < 2 + 1; i++) {
			System.out.println("Placement des bateaux du joueur " + i);
			String[] nomsBateaux = jeu.nomsBateaux();
			for (int j = 0; j < nomsBateaux.length; j++) {
				String nomBateau = nomsBateaux[j];
				int tailleBateau = jeu.nbElementBateau(nomBateau);
				placerBateau(i, nomBateau, tailleBateau);
			}

		}
	}
	
	private void placerBateau(int numJoueur, String nomBateau, int tailleBateau) {
		char lettre;
		int chiffre;
		char sens;

//		boolean place = false;
//		do {
			// Initialisation des grilles des joueurs
			System.out.println("Où souhaitez-vous positionner votre "
					+ nomBateau + "?");
			System.out.println("Donnez les coordonnées de la première case : ");
			System.out.print("Lettre = ");
			lettre = lecture.lireCaractere();
			System.out.print("Chiffre = ");
			chiffre = lecture.lireEntier();
			System.out
					.println("Sens de votre bateau (H : horizontale, V : verticale) ? ");
			sens = lecture.lireCaractere();
			if (sens != 'H') {
				sens = 'V';
			}

			jeu.initialiser(numJoueur, nomBateau, tailleBateau, lettre,
					chiffre, sens);
//			place = true;
//		} while (!place);
	}
}