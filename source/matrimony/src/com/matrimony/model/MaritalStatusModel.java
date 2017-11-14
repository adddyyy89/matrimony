package com.matrimony.model;

import com.matrimony.dto.MaritalStatusDTO;

public class MaritalStatusModel extends BaseModel<MaritalStatusEntity, MaritalStatusDTO> {

	@Override
	MaritalStatusDTO toDTO(MaritalStatusEntity entity) {
		MaritalStatusDTO dto = new MaritalStatusDTO();
		dto.maritalStatusId = entity.getMaritalStatusId();
		dto.maritalStatusText = entity.getMaritalStatusText();
		return dto;
	}

	@Override
	MaritalStatusEntity toEntity(MaritalStatusDTO dto) {
		MaritalStatusEntity entity = new MaritalStatusEntity();
		entity.setMaritalStatusId(dto.maritalStatusId);
		entity.setMaritalStatusText(dto.maritalStatusText);
		return entity;
	}

}
