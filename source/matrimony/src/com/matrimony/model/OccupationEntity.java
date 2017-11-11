package com.matrimony.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "occupation")
class OccupationEntity implements Serializable {

	private static final long serialVersionUID = 753578665820256018L;

	@Id
	@Column(name = "occupationid")
	private short occupationId;

	@Column(name = "occupationname", length = 50, nullable = false)
	private String occupationName;

	public short getOccupationId() {
		return occupationId;
	}

	public void setOccupationId(short occupationId) {
		this.occupationId = occupationId;
	}

	public String getOccupationName() {
		return occupationName;
	}

	public void setOccupationName(String occupationName) {
		this.occupationName = occupationName;
	}

}
