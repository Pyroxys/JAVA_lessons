package jeurole;

import livre.EntiteLivre;

public abstract class EtreVivant extends EntiteLivre {
	protected int qteVie;
	protected String nom;
	protected Bataille bataille;

	public EtreVivant(int qteVie, String nom) {
		this.qteVie = qteVie;
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void subirAttaque(int forceAttaque) {
        qteVie -= forceAttaque;
        _livre.ecrire(getNom() + " subit une violente attaque");
        if(qteVie <= 0) {
            _livre.ecrire("trop violente pour survivre");
            mourir();
        } else {
            _livre.ecrire("mais il parvient à se relever.\n");
        }
    }
	
	public void rejointBataille(Bataille bataille) {
		this.bataille = bataille;
	}
	
	public abstract void mourir();

}