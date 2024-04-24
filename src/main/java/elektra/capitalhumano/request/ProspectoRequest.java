package elektra.capitalhumano.request;

import java.time.LocalDate;


public class ProspectoRequest {

	private int id;
	private String nombre;
	private String apellidos;
	private String email;
	private LocalDate fechaNac;
	private String rfc;
	private String telefono;
	private int domId;
	
	public ProspectoRequest() {
		
	}

	

	public ProspectoRequest(int id, String nombre, String apellidos, String email, LocalDate fechaNac, String rfc,
			String telefono, int domId) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.fechaNac = fechaNac;
		this.rfc = rfc;
		this.telefono = telefono;
		this.domId = domId;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public int getDomId() {
		return domId;
	}



	public void setDomId(int domId) {
		this.domId = domId;
	}
	
	

}
