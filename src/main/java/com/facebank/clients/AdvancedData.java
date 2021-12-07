package com.facebank.clients;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "AdvancedData")
public class AdvancedData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "ADVANCEDDATA_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "ADVANCEDDATA_ID_SEQ", name = "ADVANCEDDATA_ID_GENERATOR")
	private java.lang.Long id;

	private java.lang.String bvUser;

	private java.lang.String mail;

	private java.lang.String secretQuestion;

	private java.lang.String secretAnswer;

	private java.lang.String profession;

	private java.lang.String openingReason;

	private java.lang.String initialFundsSource;

	private java.lang.String futureDepositsSource;

	private java.lang.String workingCondition;

	private java.lang.String companyWhereClientWorks;

	private java.lang.String activity;

	private java.lang.String position;

	private java.lang.Boolean governmentRelationship;

	private java.lang.Boolean politicallyExposed;

	public AdvancedData() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getBvUser() {
		return this.bvUser;
	}

	public void setBvUser(java.lang.String bvUser) {
		this.bvUser = bvUser;
	}

	public java.lang.String getMail() {
		return this.mail;
	}

	public void setMail(java.lang.String mail) {
		this.mail = mail;
	}

	public java.lang.String getSecretQuestion() {
		return this.secretQuestion;
	}

	public void setSecretQuestion(java.lang.String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}

	public java.lang.String getSecretAnswer() {
		return this.secretAnswer;
	}

	public void setSecretAnswer(java.lang.String secretAnswer) {
		this.secretAnswer = secretAnswer;
	}

	public java.lang.String getProfession() {
		return this.profession;
	}

	public void setProfession(java.lang.String profession) {
		this.profession = profession;
	}

	public java.lang.String getOpeningReason() {
		return this.openingReason;
	}

	public void setOpeningReason(java.lang.String openingReason) {
		this.openingReason = openingReason;
	}

	public java.lang.String getInitialFundsSource() {
		return this.initialFundsSource;
	}

	public void setInitialFundsSource(java.lang.String initialFundsSource) {
		this.initialFundsSource = initialFundsSource;
	}

	public java.lang.String getFutureDepositsSource() {
		return this.futureDepositsSource;
	}

	public void setFutureDepositsSource(java.lang.String futureDepositsSource) {
		this.futureDepositsSource = futureDepositsSource;
	}

	public java.lang.String getWorkingCondition() {
		return this.workingCondition;
	}

	public void setWorkingCondition(java.lang.String workingCondition) {
		this.workingCondition = workingCondition;
	}

	public java.lang.String getCompanyWhereClientWorks() {
		return this.companyWhereClientWorks;
	}

	public void setCompanyWhereClientWorks(
			java.lang.String companyWhereClientWorks) {
		this.companyWhereClientWorks = companyWhereClientWorks;
	}

	public java.lang.String getActivity() {
		return this.activity;
	}

	public void setActivity(java.lang.String activity) {
		this.activity = activity;
	}

	public java.lang.String getPosition() {
		return this.position;
	}

	public void setPosition(java.lang.String position) {
		this.position = position;
	}

	public java.lang.Boolean getGovernmentRelationship() {
		return this.governmentRelationship;
	}

	public void setGovernmentRelationship(
			java.lang.Boolean governmentRelationship) {
		this.governmentRelationship = governmentRelationship;
	}

	public java.lang.Boolean getPoliticallyExposed() {
		return this.politicallyExposed;
	}

	public void setPoliticallyExposed(java.lang.Boolean politicallyExposed) {
		this.politicallyExposed = politicallyExposed;
	}

	public AdvancedData(java.lang.Long id, java.lang.String bvUser,
			java.lang.String mail, java.lang.String secretQuestion,
			java.lang.String secretAnswer, java.lang.String profession,
			java.lang.String openingReason,
			java.lang.String initialFundsSource,
			java.lang.String futureDepositsSource,
			java.lang.String workingCondition,
			java.lang.String companyWhereClientWorks,
			java.lang.String activity, java.lang.String position,
			java.lang.Boolean governmentRelationship,
			java.lang.Boolean politicallyExposed) {
		this.id = id;
		this.bvUser = bvUser;
		this.mail = mail;
		this.secretQuestion = secretQuestion;
		this.secretAnswer = secretAnswer;
		this.profession = profession;
		this.openingReason = openingReason;
		this.initialFundsSource = initialFundsSource;
		this.futureDepositsSource = futureDepositsSource;
		this.workingCondition = workingCondition;
		this.companyWhereClientWorks = companyWhereClientWorks;
		this.activity = activity;
		this.position = position;
		this.governmentRelationship = governmentRelationship;
		this.politicallyExposed = politicallyExposed;
	}

}