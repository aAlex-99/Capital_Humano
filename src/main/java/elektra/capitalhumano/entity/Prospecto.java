package elektra.capitalhumano.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="PROSPECTO")
public class Prospecto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID", columnDefinition="NUMBER")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(255)")
	private String nombre;
	
	@Column(name="APELLIDOS", columnDefinition="NVARCHAR2(255)")
	private String apellidos;
	
	@Column(name="EMAIL", columnDefinition="NVARCHAR2(255)")
	private String email;
	
	@Column(name="FECHA_NAC", columnDefinition="DATE")
	private LocalDate fechaNac;
	
	@Column(name="RFC", columnDefinition="NVARCHAR2(255)")
	private String rfc;
	
	@Column(name="TELEFONO", columnDefinition="NUMBER")
	private String telefono;
	
	@Column(name="DOM_ID", columnDefinition="NUMBER")
	private int domId;
	
	@JsonManagedReference
	@OneToMany(mappedBy="prospecto")
	private List<ProsEmpleo> relacionados;
	
	public List<ProsEmpleo> getRelacionados() {
		return relacionados;
	}
	public void setRelacionados(List<ProsEmpleo> relacionados) {
		this.relacionados = relacionados;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
