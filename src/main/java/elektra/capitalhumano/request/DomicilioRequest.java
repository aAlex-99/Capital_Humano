package elektra.capitalhumano.request;

import jakarta.persistence.Column;

public class DomicilioRequest {

	private int domId;
	private String calle;
	private String numero;
	private String colonia;
	private String ciudad;
	private String estado;
	private String pais;
	private String codigPostal;

	public DomicilioRequest() {

	}

	public DomicilioRequest(int domId, String calle, String numero, String colonia, String ciudad, String estado,
			String pais, String codigPostal) {
		super();
		this.domId = domId;
		this.calle = calle;
		this.numero = numero;
		this.colonia = colonia;
		this.ciudad = ciudad;
		this.estado = estado;
		this.pais = pais;
		this.codigPostal = codigPostal;
	}

	public int getDomId() {
		return domId;
	}

	public void setDomId(int domId) {
		this.domId = domId;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodigPostal() {
		return codigPostal;
	}

	public void setCodigPostal(String codigPostal) {
		this.codigPostal = codigPostal;
	}

}
