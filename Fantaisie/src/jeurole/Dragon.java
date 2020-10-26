package jeurole;

public class Dragon extends EtreVivant {

	public Dragon(String nom) {
		super(200, nom);
	}
	
	@Override
	public void mourir() {
		_livre.ecrire("c'est ainsi que le courageux " + this.nom + " mourut.\n");
		this.bataille.eliminer(this);
	}

	@Override
	public void rejointBataille(Bataille bataille) {
		super.rejointBataille(bataille);
		this.bataille.ajouter(this);
	}
	
	public void cracheBouleFeu(Homme homme) {
		int bouleDeFeu = 10;
		
		if (bouleDeFeu > 10) {
			homme.subirAttaque(100);
			bouleDeFeu--;
			_livre.ecrire(this.getNom() + " Crache une oule de feu " + homme.getNom());
		} else {
			_livre.ecrire(this.getNom() + " n'avais plius de feu en lui " + homme.getNom() + "a eu beaucoup de chance");
		}
	}
}

