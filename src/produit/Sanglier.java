package produit;
import personnages.Gaulois;

public class Sanglier extends Produit {
	private String nom = "Sanglier";
	private Unite unite = Unite.KILOGRAMME;
	
	private int poids;
	private Gaulois chasseur;
	
	public Sanglier(String nom, int poids, Gaulois chasseur) {
		this.nom = nom;
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	public String description() {
		return (nom + " de " + poids + unite.toString() 
				+ " chassé par " + chasseur.getNom());
	}
}
