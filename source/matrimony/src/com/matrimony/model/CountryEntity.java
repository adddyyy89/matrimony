package com.matrimony.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
class CountryEntity implements Serializable {
	
	private static final long serialVersionUID = -8885217535386696628L;

	@Id
	@Column(name = "countryid")
	private short countryId;
	
	@Column(name = "countryname", nullable = false, length = 100)
	private String countryName;
	
	@Column(name = "alphacode2", nullable = false, length = 2)
	private String alphaCode2;

	@Column(name = "alphacode3", nullable = false, length = 3)
	private String alphaCode3;
	
	@Column(name = "iso3166code", nullable = false, length = 13)
	private String iso3166Code;
	
	public short getCountryId() {
		return countryId;
	}

	public void setCountryId(short countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getAlphaCode2() {
		return alphaCode2;
	}

	public void setAlphaCode2(String alphaCode2) {
		this.alphaCode2 = alphaCode2;
	}

	public String getAlphaCode3() {
		return alphaCode3;
	}

	public void setAlphaCode3(String alphaCode3) {
		this.alphaCode3 = alphaCode3;
	}

	public String getISO3166Code() {
		return iso3166Code;
	}

	public void setISO3166Code(String iso3166Code) {
		this.iso3166Code = iso3166Code;
	}
	
}
