package com.matrimony.model;

import com.matrimony.dto.EducationDTO;

public class EducationModel extends BaseModel<EducationEntity, EducationDTO> {

	@Override
	EducationDTO toDTO(EducationEntity entity) {
		EducationDTO dto = new EducationDTO();
		dto.courseId = entity.getCourseId();
		dto.courseName = entity.getCourseName();
		return dto;
	}

	@Override
	EducationEntity toEntity(EducationDTO dto) {
		EducationEntity entity = new EducationEntity();
		entity.setCourseId(dto.courseId);
		entity.setCourseName(dto.courseName);
		return entity;
	}

}
