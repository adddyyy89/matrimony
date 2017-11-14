package com.matrimony.model;

import com.matrimony.dto.UserDetailsDTO;

public class UserDetailsModel extends BaseModel<UserDetailsEntity, UserDetailsDTO> {

	@Override
	UserDetailsDTO toDTO(UserDetailsEntity entity) {
		UserDetailsDTO dto = new UserDetailsDTO();
		dto.aboutMe = entity.getAboutMe();
		dto.addressLine1 = entity.getAddressLine1();
		dto.addressLine2 = entity.getAddressLine2();
		dto.citizenshipId = entity.getCitizenshipId();
		dto.dob = entity.getDob();
		dto.educationId = entity.getEducationId();
		dto.employmentId = entity.getEmploymentId();
		dto.familyTypeId = entity.getFamilyTypeId();
		dto.firstName = entity.getFirstName();
		dto.genderId = entity.getGenderId();
		dto.height = entity.getHeight();
		dto.income = entity.getIncome();
		dto.incomeCurrencyId = entity.getIncomeCurrencyId();
		dto.isDeleted = entity.isDeleted();
		dto.isVerifiedMobileNo = entity.isVerifiedMobileNo();
		dto.lastName = entity.getLastName();
		dto.maritalStatusId = entity.getMaritalStatusId();
		dto.mobileNo = entity.getMobileNo();
		dto.occupationId = entity.getOccupationId();
		dto.physicalDisability = entity.isPhysicalDisability();
		dto.pincode = entity.getPincode();
		dto.placeId = entity.getPlaceId();
		dto.profilePicturePath = entity.getProfilePicturePath();
		dto.userId = entity.getUserId();
		dto.workLocation = entity.getWorkLocation();
		return dto;
	}

	@Override
	UserDetailsEntity toEntity(UserDetailsDTO dto) {
		UserDetailsEntity entity = new UserDetailsEntity();
		entity.setAboutMe(dto.aboutMe);
		entity.setAddressLine1(dto.addressLine1);
		entity.setAddressLine2(dto.addressLine2);
		entity.setCitizenshipId(dto.citizenshipId);
		entity.setDeleted(dto.isDeleted);
		entity.setDob(dto.dob);
		entity.setEducationId(dto.educationId);
		entity.setEmploymentId(dto.employmentId);
		entity.setFamilyTypeId(dto.familyTypeId);
		entity.setFirstName(dto.firstName);
		entity.setGenderId(dto.genderId);
		entity.setHeight(dto.height);
		entity.setIncome(dto.income);
		entity.setIncomeCurrencyId(dto.incomeCurrencyId);
		entity.setLastName(dto.lastName);
		entity.setMaritalStatusId(dto.maritalStatusId);
		entity.setMobileNo(dto.mobileNo);
		entity.setOccupationId(dto.occupationId);
		entity.setPhysicalDisability(dto.physicalDisability);
		entity.setPincode(dto.pincode);
		entity.setPlaceId(dto.placeId);
		entity.setProfilePicturePath(dto.profilePicturePath);
		entity.setUserId(dto.userId);
		entity.setVerifiedMobileNo(dto.isVerifiedMobileNo);
		entity.setWorkLocation(dto.workLocation);
		return entity;
	}

}
