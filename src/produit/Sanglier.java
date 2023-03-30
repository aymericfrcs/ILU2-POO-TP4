package produit;
import personnages.Gaulois;

public class Sanglier extends Produit {
	private String nom = "Sanglier";
	private Unite unite = Unite.GRAMME;
	
	private int poids;
	private Gaulois chasseur;
	
	public Sanglier(int poids, Gaulois chasseur) {
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	public String description() {
		return (nom + " de " + poids + unite.toString() 
				+ " chass� par " + chasseur.getNom());
	}
}
