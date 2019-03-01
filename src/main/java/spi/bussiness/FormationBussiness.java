package spi.bussiness;

import java.util.List;

import spi.bean.Formation;

public interface FormationBussiness {
	Formation creerFormation(Formation formationACreer);

	 List<Formation> recupererToutesLesFormations();
	 List<Formation> rechercherFormationParNom(String nom);
	 //List<Formation> recupererToutesLesFormationsParId(String id);
	 Formation rechercherFormationParId(String id);

	void supprimerFormationByID(String codeFormation);

	Formation updateFormation(Formation formationMaj);

}
