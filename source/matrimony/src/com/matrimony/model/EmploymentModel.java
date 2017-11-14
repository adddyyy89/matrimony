package com.matrimony.model;

import com.matrimony.dto.EmploymentDTO;

public class EmploymentModel extends BaseModel<EmploymentEntity, EmploymentDTO> {

	@Override
	EmploymentDTO toDTO(EmploymentEntity entity) {
		EmploymentDTO dto = new EmploymentDTO();
		dto.employmentId = entity.getEmploymentId();
		dto.employmentText = entity.getEmploymentText();
		return dto;
	}

	@Override
	EmploymentEntity toEntity(EmploymentDTO dto) {
		EmploymentEntity entity = new EmploymentEntity();
		entity.setEmploymentId(dto.employmentId);
		entity.setEmploymentText(dto.employmentText);
		return entity;
	}

}
