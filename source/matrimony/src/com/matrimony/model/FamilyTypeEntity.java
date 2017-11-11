package com.matrimony.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "familytype")
class FamilyTypeEntity implements Serializable {

	private static final long serialVersionUID = 3254574340101125298L;

	@Id
	@Column(name = "familytypeid")
	private short familyTypeId;

	@Column(name = "familytypetext", length = 50)
	private String familyTypeText;

	public short getFamilyTypeId() {
		return familyTypeId;
	}

	public void setFamilyTypeId(short familyTypeId) {
		this.familyTypeId = familyTypeId;
	}

	public String getFamilyTypeText() {
		return familyTypeText;
	}

	public void setFamilyTypeText(String familyTypeText) {
		this.familyTypeText = familyTypeText;
	}

}
