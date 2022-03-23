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

	private java.lang.String clientName;

	private java.lang.String bdfLogin;

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

	public java.lang.String getClientName() {
		return this.clientName;
	}

	public void setClientName(java.lang.String clientName) {
		this.clientName = clientName;
	}

	public java.lang.String getBdfLogin() {
		return this.bdfLogin;
	}

	public void setBdfLogin(java.lang.String bdfLogin) {
		this.bdfLogin = bdfLogin;
	}

	public HeaderData(java.lang.Long id, java.lang.String bdf,
			java.lang.String clientName, java.lang.String bdfLogin) {
		this.id = id;
		this.bdf = bdf;
		this.clientName = clientName;
		this.bdfLogin = bdfLogin;
	}

}