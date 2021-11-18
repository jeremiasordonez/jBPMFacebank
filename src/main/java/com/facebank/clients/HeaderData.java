package com.facebank.clients;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class HeaderData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "HEADERDATA_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "HEADERDATA_ID_SEQ", name = "HEADERDATA_ID_GENERATOR")
	private java.lang.Long id;

	private java.lang.String bdf;

	private java.time.LocalDateTime created;

	private java.lang.String clientName;

	private java.lang.String status;

	public HeaderData() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getBdf() {
		return this.bdf;
	}

	public void setBdf(java.lang.String bdf) {
		this.bdf = bdf;
	}

	public java.time.LocalDateTime getCreated() {
		return this.created;
	}

	public void setCreated(java.time.LocalDateTime created) {
		this.created = created;
	}

	public java.lang.String getClientName() {
		return this.clientName;
	}

	public void setClientName(java.lang.String clientName) {
		this.clientName = clientName;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public HeaderData(java.lang.Long id, java.lang.String bdf,
			java.time.LocalDateTime created, java.lang.String clientName,
			java.lang.String status) {
		this.id = id;
		this.bdf = bdf;
		this.created = created;
		this.clientName = clientName;
		this.status = status;
	}

}