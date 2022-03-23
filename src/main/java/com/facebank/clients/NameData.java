package com.facebank.clients;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class NameData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "NAMEDATA_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "NAMEDATA_ID_SEQ", name = "NAMEDATA_ID_GENERATOR")
	private java.lang.Long id;

	private java.lang.String firstName;

	private java.lang.String fullName;

	private java.lang.String givenName;

	private java.lang.String machineReadableFullName;

	private java.lang.String paternalLastName;

	public NameData() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public java.lang.String getFullName() {
		return this.fullName;
	}

	public void setFullName(java.lang.String fullName) {
		this.fullName = fullName;
	}

	public java.lang.String getGivenName() {
		return this.givenName;
	}

	public void setGivenName(java.lang.String givenName) {
		this.givenName = givenName;
	}

	public java.lang.String getMachineReadableFullName() {
		return this.machineReadableFullName;
	}

	public void setMachineReadableFullName(
			java.lang.String machineReadableFullName) {
		this.machineReadableFullName = machineReadableFullName;
	}

	public java.lang.String getPaternalLastName() {
		return this.paternalLastName;
	}

	public void setPaternalLastName(java.lang.String paternalLastName) {
		this.paternalLastName = paternalLastName;
	}

	public NameData(java.lang.Long id, java.lang.String firstName,
			java.lang.String fullName, java.lang.String givenName,
			java.lang.String machineReadableFullName,
			java.lang.String paternalLastName) {
		this.id = id;
		this.firstName = firstName;
		this.fullName = fullName;
		this.givenName = givenName;
		this.machineReadableFullName = machineReadableFullName;
		this.paternalLastName = paternalLastName;
	}

}