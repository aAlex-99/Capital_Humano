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
@Table(name = "EMPLEO")
public class Empleo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EMP_ID", columnDefinition = "NUMBER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;

	@Column(name = "EMPRESA", columnDefinition = "NVARCHAR2(255)")
	private String empresa;

	@Column(name = "FECHA_INGRESO", columnDefinition = "DATE")
	private LocalDate fechaIngreso;

	@Column(name = "FECHA_SALIDA", columnDefinition = "DATE")
	private LocalDate fechaSalida;

	@Column(name = "INGRESO_MENSUAL", columnDefinition = "NUMBER(7,2)")
	private double ingresoMensual;

	@Column(name = "GIRO_EMPRESA", columnDefinition = "NVARCHAR2(255)")
	private String giroEmpresa;

	@JsonManagedReference
	@OneToMany(mappedBy = "empleo")
	private List<ProsEmpleo> relacionados;
	
	public List<ProsEmpleo> getRelacionados() {
		return relacionados;
	}

	public void setRelacionados(List<ProsEmpleo> relacionados) {
		this.relacionados = relacionados;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public double getIngresoMensual() {
		return ingresoMensual;
	}

	public void setIngresoMensual(double ingresoMensual) {
		this.ingresoMensual = ingresoMensual;
	}

	public String getGiroEmpresa() {
		return giroEmpresa;
	}

	public void setGiroEmpresa(String giroEmpresa) {
		this.giroEmpresa = giroEmpresa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
