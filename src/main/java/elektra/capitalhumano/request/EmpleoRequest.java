package elektra.capitalhumano.request;

import java.time.LocalDate;

public class EmpleoRequest {

	private int empId;
	private String empresa;
	private LocalDate fechaIngreso;
	private LocalDate fechaSalida;
	private double ingresoMensual;
	private String giroEmpresa;

	public EmpleoRequest() {

	}

	public EmpleoRequest(int empId, String empresa, LocalDate fechaIngreso, LocalDate fechaSalida,
			double ingresoMensual, String giroEmpresa) {
		super();
		this.empId = empId;
		this.empresa = empresa;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.ingresoMensual = ingresoMensual;
		this.giroEmpresa = giroEmpresa;
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

}
