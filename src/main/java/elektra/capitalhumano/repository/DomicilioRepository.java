package elektra.capitalhumano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import elektra.capitalhumano.entity.Domicilio;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio,Integer>{

}
