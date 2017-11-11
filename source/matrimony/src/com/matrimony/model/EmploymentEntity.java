package com.matrimony.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employment")
class EmploymentEntity implements Serializable {

	private static final long serialVersionUID = 752810534145816385L;

	@Id
	@Column(name = "employmentid")
	private short employmentId;

	@Column(name = "employmenttext", length = 50, nullable = false)
	private String employmentText;

	public short getEmploymentId() {
		return employmentId;
	}

	public void setEmploymentId(short employmentId) {
		this.employmentId = employmentId;
	}

	public String getEmploymentText() {
		return employmentText;
	}

	public void setEmploymentText(String employmentText) {
		this.employmentText = employmentText;
	}

	
}
