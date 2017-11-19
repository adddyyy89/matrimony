package com.matrimony.model;

import java.util.List;

import org.hibernate.Session;

import com.matrimony.dto.UserCredentialsDTO;
import com.matrimony.exceptions.ResultNotFoundException;

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

	public String getPasswordUsingEmailId(Session session, String emailId) throws ResultNotFoundException {
		String query = "SELECT password FROM usercredentials WHERE emailid = :emailId; ";
		
		@SuppressWarnings("unchecked")
		List<String> passwordList = session.createSQLQuery(query).setParameter("emailId", emailId).list(); 
		if(passwordList == null || passwordList.isEmpty()){
			throw new ResultNotFoundException("password not found for email = " + emailId);
		}
		return passwordList.get(0);
	}

}
