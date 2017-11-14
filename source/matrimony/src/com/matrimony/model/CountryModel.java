package com.matrimony.model;

import com.matrimony.dto.CountryDTO;

public class CountryModel extends BaseModel<CountryEntity, CountryDTO> {

	@Override
	CountryDTO toDTO(CountryEntity entity) {
		CountryDTO dto = new CountryDTO();
		dto.alphaCode2 = entity.getAlphaCode2();
		dto.alphaCode3 = entity.getAlphaCode3();
		dto.countryId = entity.getCountryId();
		dto.countryName = entity.getCountryName();
		dto.iso3166Code = entity.getISO3166Code();
		return dto;
	}

	@Override
	CountryEntity toEntity(CountryDTO dto) {
		CountryEntity entity = new CountryEntity();
		entity.setAlphaCode2(dto.alphaCode2);
		entity.setAlphaCode3(dto.alphaCode3);
		entity.setCountryId(dto.countryId);
		entity.setCountryName(dto.countryName);
		entity.setISO3166Code(dto.iso3166Code);
		return entity;
	}

}
