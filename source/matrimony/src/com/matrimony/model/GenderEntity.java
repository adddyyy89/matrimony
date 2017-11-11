package com.matrimony.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Deprecated Do not use this class. Instead use GenderEnum.
 * This class is only kept for hibernate to verify table structure.
 */
@Entity
@Table(name = "gender")
class GenderEntity {
	
	@Id
	@Column(name = "genderid",nullable=false)
	private short genderId;
	
	@Column(name = "gendername", nullable = false, length = 50)
	private String genderName;
	
	public short getGenderId() {
		return genderId;
	}

	public void setGenderId(short genderId) {
		this.genderId = genderId;
	}

	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}

}