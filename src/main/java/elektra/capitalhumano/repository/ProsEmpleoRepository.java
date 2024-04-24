package elektra.capitalhumano.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import elektra.capitalhumano.entity.ProsEmpleo;
import elektra.capitalhumano.entity.Prospecto;

@Repository
public interface ProsEmpleoRepository extends JpaRepository<ProsEmpleo, Integer>{
	
	@Query("SELECT pe FROM ProsEmpleo pe WHERE pe.empleo.empresa=:company")
	List<ProsEmpleo> findByCompany(@Param("company")String company);
	
	@Query("SELECT pe FROM ProsEmpleo pe WHERE pe.empleo.ingresoMensual>:salary")
	List<ProsEmpleo> findByHighestSalary(@Param("salary")int salary);
}
