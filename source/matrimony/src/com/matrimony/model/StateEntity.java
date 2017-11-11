package com.matrimony.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "state")
class StateEntity {
	
	@Id
	@Column(name = "stateid",nullable = false)
	private int stateId;
	
	@Column(name = "statename", nullable = false, length = 100)
	private String stateName;
	
	@Column(name = "countryid", nullable = false)
	private short countryId;
	
	@Transient
	private CountryEntity country = null;

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public short getCountryId() {
		return countryId;
	}

	public void setCountryId(short countryId) {
		this.countryId = countryId;
	}

	public CountryEntity getCountry() {
		return country;
	}

	public void setCountry(CountryEntity country) {
		this.country = country;
	}
}
