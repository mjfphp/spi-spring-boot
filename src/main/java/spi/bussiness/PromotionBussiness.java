package spi.bussiness;

import java.util.List;

import spi.bean.Promotion;
import spi.bean.PromotionPK;

public interface PromotionBussiness {

	Promotion creerPromotion(Promotion promotiontACreer);
	void supprimerPromotion(Promotion promotionASupp);
	List<Promotion> recupererTousLesPromotions();
	List<Promotion> rechercheSiglePromotion(String siglePromotion);
	Promotion rechercherPromotionParId(PromotionPK PK );
	void supprimerPromotionByID(PromotionPK promotionASuppPK);
	public Promotion rechercherParTypeProcessusStage(String processusStage);

}
