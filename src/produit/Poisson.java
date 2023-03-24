package produit;

public class Poisson extends Produit {
	private String nom = "Poisson";
	private Unite unite = Unite.KILOGRAMME;
	private String datePeche;
	
	public Poisson(String nom, String datePeche) {
		this.nom = nom;
		this.datePeche = datePeche;
	}
	
	public String description() {
		return (nom + " pêché " + datePeche);
	}
	
}
