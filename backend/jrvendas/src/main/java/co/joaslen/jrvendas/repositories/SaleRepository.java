package co.joaslen.jrvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.joaslen.jrvendas.dto.SaleSuccessDTO;
import co.joaslen.jrvendas.dto.SaleSumDTO;
import co.joaslen.jrvendas.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{
	
		@Query("SELECT new co.joaslen.jrvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) FROM Sale AS obj GROUP BY obj.seller ")
		List<SaleSumDTO> amountGroupedBySeller();
		
		@Query("SELECT new co.joaslen.jrvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) FROM Sale AS obj GROUP BY obj.seller ")
		List<SaleSuccessDTO> successGroupedBySeller();

}
