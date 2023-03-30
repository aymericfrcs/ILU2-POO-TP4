package scenarioTest;

import personnages.*;
import produit.*;
import villagegaulois.*;

public class ScenarioTest {
	public static void main(String[] args) {
		Etal[] etals = new Etal[3];
		// Impossible d'obtenir un marche compos� d'�tals de poisson ou de sangliers.
		// Seulement des march�s QUE de poisson ou QUE de sanglier
		Etal etalSanglier1 = new Etal();
		Etal etalSanglier2 = new Etal();
		Etal etalPoisson = new Etal();
		etals[0] = etalSanglier1;
		etals[1] = etalSanglier2;
		etals[2] = etalPoisson;
		
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		
		Poisson poisson1 = new Poisson(2, "lundi");
		Poisson[] poissons = {poisson1};
		
		etals[0].installerVendeur(obelix, sangliersObelix, 8);
		etals[1].installerVendeur(asterix, sangliersAsterix, 10);
		
		etals[2].installerVendeur(ordralfabetix, poissons, 7);
	}
	
}
