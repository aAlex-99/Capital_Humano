package elektra.capitalhumano.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import elektra.capitalhumano.entity.Empleo;
@Repository
public interface EmpleoRepository extends JpaRepository<Empleo, Integer>{
	
	
	
	@Query("SELECT e FROM Empleo WHERE e.empresa=:company")
	Empleo findByCompany(@Param("company")String company);
	
	@Query("SELECT e FROM Empleo e WHERE e.fechaSalida=null")
	List<Empleo> findCurrents();
}
