package spi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import spi.bean.Enseignant;

public interface EnseignantRepository extends CrudRepository<Enseignant, String> {

	List<Enseignant> findByNom(String nom);
	Enseignant findByNoEnseignant(long id);
	Enseignant findByEmailUbo(String emailUbo);
	Enseignant findByAdresse (String adresse);
	

}
