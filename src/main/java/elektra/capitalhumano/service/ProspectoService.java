package elektra.capitalhumano.service;

import java.util.List;

import elektra.capitalhumano.entity.Prospecto;
import elektra.capitalhumano.request.ProspectoRequest;

public interface ProspectoService {
	
	Prospecto guardar(ProspectoRequest request);
	Prospecto modificar(ProspectoRequest request);
	Prospecto buscar(int id);
	List<Prospecto> buscarPorEmpresa(String empresa);
	List<Prospecto> buscarPorIngresosAltos(int ingreso);
	List<Prospecto> buscarProspectosEmpleoVigente();
	String eliminarProspectoPorId(int id);
	String eliminarProspectoPorCorre(String correo);
	
	

}
