package produit;

public enum Unite {
	LITRE("l"), CENTILITRE("cl"), MILILITRE("ml"), GRAMME("g"), 
	KILOGRAMME("kg"), PIECE("pi�ce(s)");
	
	private String nom;
	
	private Unite(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
}
