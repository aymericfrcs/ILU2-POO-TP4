package produit;

public enum Unite {
	LITRE("l"), CENTILITRE("cl"), MILILITRE("ml"), GRAMME("g"), 
	KILOGRAMME("kg"), PIECE("pièce(s)");
	
	private String nom;
	
	private Unite(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
}
