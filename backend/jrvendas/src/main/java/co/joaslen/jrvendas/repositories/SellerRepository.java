package co.joaslen.jrvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.joaslen.jrvendas.entities.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long>{

}
