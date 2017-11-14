package com.matrimony.model;

import com.matrimony.dto.UserCredentialsDTO;

public class UserCredentialsModel extends BaseModel<UserCredentialsEntity, UserCredentialsDTO	>{

	@Override
	UserCredentialsDTO toDTO(UserCredentialsEntity entity) {
		UserCredentialsDTO dto = new UserCredentialsDTO();
		dto.emailId = entity.getEmailId();
		dto.lastLoginOn = entity.getLastLoginOn();
		dto.password = entity.getPassword();
		dto.registedOn = entity.getRegistedOn();
		dto.userId = entity.getUserId();
		return dto;
	}

	@Override
	UserCredentialsEntity toEntity(UserCredentialsDTO dto) {
		UserCredentialsEntity entity = new UserCredentialsEntity();
		entity.setEmailId(dto.emailId);
		entity.setLastLoginOn(dto.lastLoginOn);
		entity.setPassword(dto.password);
		entity.setRegistedOn(dto.registedOn);
		entity.setUserId(dto.userId);
		return entity;
	}

}
