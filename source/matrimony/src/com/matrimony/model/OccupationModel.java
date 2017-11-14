package com.matrimony.model;

import com.matrimony.dto.OccupationDTO;

public class OccupationModel extends BaseModel<OccupationEntity, OccupationDTO> {

	@Override
	OccupationDTO toDTO(OccupationEntity entity) {
		OccupationDTO dto = new OccupationDTO();
		dto.occupationId = entity.getOccupationId();
		dto.occupationName = entity.getOccupationName();
		return dto;
	}

	@Override
	OccupationEntity toEntity(OccupationDTO dto) {
		OccupationEntity entity = new OccupationEntity();
		entity.setOccupationId(dto.occupationId);
		entity.setOccupationName(dto.occupationName);
		return entity;
	}

}
