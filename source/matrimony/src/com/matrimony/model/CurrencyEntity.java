package com.matrimony.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "currency")
class CurrencyEntity implements Serializable {

	private static final long serialVersionUID = -4782706142555140442L;

	@Id
	@Column(name = "currencyid")
	private int currencyId;

	@Column(name = "currencyname", length = 50, nullable = false)
	private String currencyName;

	public int getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

}