package com.matrimony.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

class UserCredentialsEntity implements Serializable {

	private static final long serialVersionUID = -3888888828049936502L;

	@Id
	@Column(name = "userid", nullable = false)
	private long userId;

	@Column(name = "emailid", nullable = false, length = 50)
	private String emailId;

	@Column(name = "password", nullable = false, length = 100)
	private String password;

	@Column(name = "registedon", nullable = false)
	private Timestamp registedOn;

	@Column(name = "lastloginon")
	private Timestamp lastLoginOn;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getRegistedOn() {
		return registedOn;
	}

	public void setRegistedOn(Timestamp registedOn) {
		this.registedOn = registedOn;
	}

	public Timestamp getLastLoginOn() {
		return lastLoginOn;
	}

	public void setLastLoginOn(Timestamp lastLoginOn) {
		this.lastLoginOn = lastLoginOn;
	}

}
