package elektra.capitalhumano.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DOMICILIO")
public class Domicilio implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="DOM_ID", columnDefinition="NUMBER")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int domId;
	
	@Column(name="CALLE", columnDefinition="NVARCHAR2(255)")
	private String calle;
	
	@Column(name="NUMERO", columnDefinition="NVARCHAR2(255)")
	private String numero;
	
	@Column(name="COLONIA", columnDefinition="NVARCHAR2(255)")
	private String colonia;
	
	@Column(name="CIUDAD", columnDefinition="NVARCHAR2(255)")
	private String ciudad;
	
	@Column(name="ESTADO", columnDefinition="NVARCHAR2(255)")
	private String estado;
	
	@Column(name="PAIS", columnDefinition="NVARCHAR2(255)")
	private String pais;
	
	@Column(name="CODIGO_POSTAL", columnDefinition="NVARCHAR2(255)")
	private String codigPostal;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
