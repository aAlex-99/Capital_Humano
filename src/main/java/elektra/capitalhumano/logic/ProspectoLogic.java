package elektra.capitalhumano.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import elektra.capitalhumano.entity.Empleo;
import elektra.capitalhumano.entity.ProsEmpleo;
import elektra.capitalhumano.entity.Prospecto;
import elektra.capitalhumano.repository.EmpleoRepository;
import elektra.capitalhumano.repository.ProsEmpleoRepository;
import elektra.capitalhumano.repository.ProspectoRepository;
import elektra.capitalhumano.request.ProspectoRequest;
import elektra.capitalhumano.service.ProspectoService;

@Service
public class ProspectoLogic implements ProspectoService {

	@Autowired
	ProspectoRepository repo;

	@Autowired
	ProsEmpleoRepository proempRepo;

	@Autowired
	EmpleoRepository emplRepo;

	@Override
	public Prospecto guardar(ProspectoRequest request) {
		// TODO Auto-generated method stub

		Prospecto p = new Prospecto();

		p.setNombre(request.getNombre());
		p.setApellidos(request.getApellidos());
		p.setEmail(request.getEmail());
		p.setRfc(request.getRfc());
		p.setTelefono(request.getTelefono());
		p.setDomId(request.getDomId());

		repo.save(p);

		return p;
	}

	@Override
	public Prospecto modificar(ProspectoRequest request) {
		Prospecto p = repo.findById(request.getId()).get();

		p.setNombre(request.getNombre());
		p.setApellidos(request.getApellidos());
		p.setEmail(request.getEmail());
		p.setRfc(request.getRfc());
		p.setTelefono(request.getTelefono());
		p.setDomId(request.getDomId());

		repo.save(p);

		return p;
	}

	@Override
	public Prospecto buscar(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<Prospecto> buscarPorEmpresa(String empresa) {
		List<ProsEmpleo> relaciones = proempRepo.findByCompany(empresa);
		List<Prospecto> prospectos = new ArrayList<Prospecto>();
		Prospecto aux;
		for (ProsEmpleo prosEmpleo : relaciones) {
			aux = repo.findById(prosEmpleo.getProspecto().getId()).get();
			prospectos.add(aux);
		}

		return prospectos;
	}

	@Override
	public List<Prospecto> buscarPorIngresosAltos(int ingreso) {
		List<ProsEmpleo> relaciones = proempRepo.findByHighestSalary(ingreso);
		List<Prospecto> prospectos = new ArrayList<Prospecto>();
		Prospecto aux;
		for (ProsEmpleo prosEmpleo : relaciones) {
			aux = repo.findById(prosEmpleo.getProspecto().getId()).get();
			prospectos.add(aux);
		}

		return prospectos;
	}

	@Override
	public List<Prospecto> buscarProspectosEmpleoVigente() {

		List<Empleo> empleos = emplRepo.findCurrents();
		List<ProsEmpleo> relaciones = new ArrayList<ProsEmpleo>();
		List<Prospecto> prospectos = new ArrayList<Prospecto>();
		Prospecto prospecto;
		for (ProsEmpleo aux : relaciones) {
			prospecto = repo.findById(aux.getProspecto().getId()).get();
			prospectos.add(prospecto);

		}
		return prospectos;
	}

	@Override
	public String eliminarProspectoPorId(int id) {
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public String eliminarProspectoPorCorre(String correo) {
		Prospecto p = repo.findByEmail(correo);
		repo.deleteById(p.getId());		
		return "Eliminado";
	}

}
