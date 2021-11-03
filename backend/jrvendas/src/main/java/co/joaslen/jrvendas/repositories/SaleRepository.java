package co.joaslen.jrvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.joaslen.jrvendas.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

}
