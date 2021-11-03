package co.joaslen.jrvendas.services;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.joaslen.jrvendas.dto.SaleDTO;
import co.joaslen.jrvendas.entities.Sale;
import co.joaslen.jrvendas.repositories.SaleRepository;
import co.joaslen.jrvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable page) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(page);
		return result.map(x -> new SaleDTO(x));
	}

}
