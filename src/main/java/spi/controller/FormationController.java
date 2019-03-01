package spi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spi.bean.Enseignant;
import spi.bean.Formation;
import spi.bussiness.FormationBussiness;

@RestController 
@RequestMapping("/formations")

public class FormationController {

	
	private FormationBussiness business;

	@Autowired
	public FormationController(FormationBussiness business) {
		this.business = business;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Formation creerFormation(@RequestBody Formation formationACreer) {
		return business.creerFormation(formationACreer);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Formation updateFormation(@RequestBody Formation formationAMaj) {
		return business.updateFormation(formationAMaj);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Formation> recupererToutesLesFormations() {
		return business.recupererToutesLesFormations();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/nom/{nom}")
	public List<Formation> recupererLaFormationAvecLeNom(@PathVariable String nom) {
		return business.rechercherFormationParNom(nom);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public Formation recupererLaFormationAvecLId(@PathVariable String id) {
		return business.rechercherFormationParId(id);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/Supp/{id}")
	public void suppFormation(@PathVariable String id) {
		business.supprimerFormationByID(id);
	}
	
}
