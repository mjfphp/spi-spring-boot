package spi.bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spi.bean.Promotion;
import spi.bean.PromotionPK;
import spi.repositories.PromotionRepository;

@Component
public class PromotionBussinessJPA   implements  PromotionBussiness{
	
	private PromotionRepository repos ;
	

	@Autowired 
	public PromotionBussinessJPA(PromotionRepository repos) {
		
		this.repos = repos;
	}

	@Override
	public Promotion creerPromotion(Promotion promotiontACreer) {
		// TODO Auto-generated method stub
		
		return repos.save(promotiontACreer);
	}

	@Override
	public void supprimerPromotion(Promotion promotionASupp) {
		// TODO Auto-generated method stub
		 repos.delete(promotionASupp);
	}

	
	public Promotion rechercherParTypeProcessusStage(String processusStage)
	{
		Promotion promoRecherche = repos.findByProcessusStage(processusStage);
		return promoRecherche;
		
		
	}
	
	@Override
	public void supprimerPromotionByID(PromotionPK promotionASuppPK) {
		Promotion p = repos.findOne(promotionASuppPK)		;
		repos.delete(p);
	}
	@Override
	public List<Promotion> recupererTousLesPromotions() {
		// TODO Auto-generated method stub
		return (List<Promotion>) repos.findAll();
	}

	@Override
	public List<Promotion> rechercheSiglePromotion(String siglePromotion) {
		// TODO Auto-generated method stub
		List<Promotion> promoRecherche = repos.findBySiglePromotion(siglePromotion);
		return promoRecherche;
	}

	@Override
	public Promotion rechercherPromotionParId(PromotionPK PK) {
		// TODO Auto-generated method stub
		return repos.findOne(PK);
	}

	

}
