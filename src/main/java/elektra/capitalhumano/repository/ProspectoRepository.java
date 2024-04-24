package elektra.capitalhumano.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import elektra.capitalhumano.entity.Prospecto;

@Repository
public interface ProspectoRepository extends JpaRepository<Prospecto, Integer> {


	
	@Query("SELECT p FROM Prospecto p WHERE p.email=:email")
	Prospecto findByEmail(@Param("email")String email);

}
