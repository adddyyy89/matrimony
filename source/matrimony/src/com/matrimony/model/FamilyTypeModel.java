package com.matrimony.model;

import com.matrimony.dto.FamilyTypeDTO;

public class FamilyTypeModel extends BaseModel<FamilyTypeEntity, FamilyTypeDTO>{

	@Override
	FamilyTypeDTO toDTO(FamilyTypeEntity entity) {
		FamilyTypeDTO dto = new FamilyTypeDTO();
		dto.familyTypeId = entity.getFamilyTypeId();
		dto.familyTypeText = entity.getFamilyTypeText();
		return dto;
	}

	@Override
	FamilyTypeEntity toEntity(FamilyTypeDTO dto) {
		FamilyTypeEntity entity = new FamilyTypeEntity();
		entity.setFamilyTypeId(dto.familyTypeId);
		entity.setFamilyTypeText(dto.familyTypeText);
		return entity;
	}

}
