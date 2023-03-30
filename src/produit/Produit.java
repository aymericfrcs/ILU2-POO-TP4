package produit;
import produit.Unite;

public abstract class Produit implements IProduit {
	private String nom;
	protected Unite unite;
	@Override
	public String getNom() {
		return this.nom;
	}
	
	@Override
	public abstract String description();
}
