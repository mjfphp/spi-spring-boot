package spi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import spi.bean.Candidat;

public interface CandidatRepository extends CrudRepository<Candidat, String> {
	
	List<Candidat> findByNom(String nom);
	
	List<Candidat> findByUniversiteOrigine(String universiteOrigine);
	
	List<Candidat> findByNoCandidat(String id);

	Candidat findOne(String id);

	void delete(String arg0);

}
