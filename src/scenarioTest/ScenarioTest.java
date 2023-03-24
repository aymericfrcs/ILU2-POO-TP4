package scenarioTest;

import villagegaulois.*;
import personnages.*;
import produit.*;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal<Produit>[] marche = new IEtal[3];
		// Impossible d'obtenir un marche compos� d'�tals de poisson ou de sangliers.
		// Seulement des march�s QUE de poisson ou QUE de sanglier
		IEtal<Sanglier> etalSanglier = new Etal<>();
		IEtal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalPoisson;
	}
	
}
