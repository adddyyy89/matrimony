package com.matrimony.model;

import com.matrimony.dto.GenderDTO;

public class GenderModel extends BaseModel<GenderEntity, GenderDTO>{

	@Override
	GenderDTO toDTO(GenderEntity entity) {
		GenderDTO dto = new GenderDTO();
		dto.genderId = entity.getGenderId();
		dto.genderName = entity.getGenderName();
		return dto;
	}

	@Override
	GenderEntity toEntity(GenderDTO dto) {
		GenderEntity entity = new GenderEntity();
		entity.setGenderId(dto.genderId);
		entity.setGenderName(dto.genderName);
		return entity;
	}

}
