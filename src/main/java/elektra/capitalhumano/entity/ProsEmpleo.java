package elektra.capitalhumano.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROS_EMPLEO")
public class ProsEmpleo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "REL_ID", columnDefinition = "NUMBER")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int relId;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "PROSPECTO_ID", columnDefinition = "NUMBER")
	private Prospecto prospecto;

	@JsonBackReference
	@ManyToOne
	@Column(name = "EMPLEO_ID", columnDefinition = "NUMBER")
	private Empleo empleo;

	public int getRelId() {
		return relId;
	}

	public void setRelId(int relId) {
		this.relId = relId;
	}

	public Prospecto getProspecto() {
		return prospecto;
	}

	public void setProspecto(Prospecto prospecto) {
		this.prospecto = prospecto;
	}

	public Empleo getEmpleo() {
		return empleo;
	}

	public void setEmpleo(Empleo empleo) {
		this.empleo = empleo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
