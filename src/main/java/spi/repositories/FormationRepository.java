package spi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import spi.bean.Formation;

public interface FormationRepository extends CrudRepository<Formation, String> {

	List<Formation> findByNomFormation(String nomFormation);
	Formation findByCodeFormation(String codeFormation);
	Formation findOne(String id);
	
}
