package elektra.capitalhumano.request;

import jakarta.persistence.Column;

public class ProsEmpleoRequest {

	private int relId;
	private int prospectoId;
	private int empleoId;

	public ProsEmpleoRequest() {

	}

	public ProsEmpleoRequest(int relId, int prospectoId, int empleoId) {
		super();
		this.relId = relId;
		this.prospectoId = prospectoId;
		this.empleoId = empleoId;
	}

	public int getRelId() {
		return relId;
	}

	public void setRelId(int relId) {
		this.relId = relId;
	}

	public int getProspectoId() {
		return prospectoId;
	}

	public void setProspectoId(int prospectoId) {
		this.prospectoId = prospectoId;
	}

	public int getEmpleoId() {
		return empleoId;
	}

	public void setEmpleoId(int empleoId) {
		this.empleoId = empleoId;
	}

}
