package elektra.capitalhumano.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import elektra.capitalhumano.entity.Prospecto;
import elektra.capitalhumano.logic.ProspectoLogic;
import elektra.capitalhumano.request.ProspectoRequest;

@RestController
@RequestMapping("api/v1/prospectos")
public class ProspectoController {
	
	@Autowired
	ProspectoLogic service;
	
	
	@PostMapping
	public ResponseEntity<Prospecto> guardar(@RequestBody ProspectoRequest request) {
		Prospecto pro = service.guardar(request);		
		return new ResponseEntity<Prospecto>(pro,HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Prospecto> actualizar(@RequestBody ProspectoRequest request) {
		Prospecto pro = service.guardar(request);		
		return new ResponseEntity<Prospecto>(pro,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Prospecto> buscar(@PathVariable int id) {
		Prospecto pro = service.buscar(id);		
		return new ResponseEntity<Prospecto>(pro,HttpStatus.OK);
	}
	@GetMapping("/por-empresa/{empresa}")
	public ResponseEntity<List<Prospecto>> buscarPorEmpresa(@PathVariable String empresa) {
		List<Prospecto> prospectos = service.buscarPorEmpresa(empresa);		
		return new ResponseEntity<List<Prospecto>>(prospectos,HttpStatus.OK);
	}
	
	@GetMapping("/por-ingresos/{cantidad}")
	public ResponseEntity<List<Prospecto>> buscarPorIngresos(@PathVariable int cantidad) {
		List<Prospecto> prospectos = service.buscarPorIngresosAltos(cantidad);	
		return new ResponseEntity<List<Prospecto>>(prospectos,HttpStatus.OK);
	}
	
	@GetMapping("/por-vigencia")
	public ResponseEntity<List<Prospecto>> buscarPorVigencia() {
		List<Prospecto> prospectos = service.buscarProspectosEmpleoVigente();
		return new ResponseEntity<List<Prospecto>>(prospectos,HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminar-id/{id}")
	public ResponseEntity<String> eliminarPorId(@PathVariable int id) {
		service.eliminarProspectoPorId(id);
		return new ResponseEntity<String>("Eliminado",HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminar-email/{email}")
	public ResponseEntity<String> eliminarPorCorreo(@PathVariable String email) {
		service.eliminarProspectoPorCorre(email);
		return new ResponseEntity<String>("Eliminado",HttpStatus.OK);
	}
	
	

}
