package spi.bussiness;

import java.util.List;

import spi.bean.Enseignant;

public interface EnseignantBusiness {

	Enseignant creerEnseignant(Enseignant enseignantACreer);

	List<Enseignant> rechercheEnseignantParNom(String nom);

	List<Enseignant> recupererTousLesEnseignants();

	Enseignant rechercherEnseignantParId(long id);

	void supprimerEnseignantByID(long id);

	Enseignant rechercherParAdresse(String adresse);
}
