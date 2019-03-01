package spi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import spi.bean.Promotion;
import spi.bean.PromotionPK;



public interface PromotionRepository extends CrudRepository<Promotion, PromotionPK>  {
	List<Promotion> findBySiglePromotion(String siglePromotion);
	Promotion  findByProcessusStage(String processusStage);
	Promotion findOne(PromotionPK pK);
}
