package com.matrimony.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maritalstatus")
class MaritalStatusEntity implements Serializable {

	private static final long serialVersionUID = 6811758905864316768L;

	@Id
	@Column(name = "maritalstatusid")
	private short maritalStatusId;

	@Column(name = "maritalstatustext", length = 50)
	private String maritalStatusText;

	public short getMaritalStatusId() {
		return maritalStatusId;
	}

	public void setMaritalStatusId(short maritalStatusId) {
		this.maritalStatusId = maritalStatusId;
	}

	public String getMaritalStatusText() {
		return maritalStatusText;
	}

	public void setMaritalStatusText(String maritalStatusText) {
		this.maritalStatusText = maritalStatusText;
	}

}
