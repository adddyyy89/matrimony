package com.matrimony.model;

import com.matrimony.dto.CurrencyDTO;

public class CurrencyModel extends BaseModel<CurrencyEntity, CurrencyDTO> {

	@Override
	CurrencyDTO toDTO(CurrencyEntity entity) {
		CurrencyDTO dto = new CurrencyDTO();
		dto.currencyId = entity.getCurrencyId();
		dto.currencyName = entity.getCurrencyName();
		return dto;
	}

	@Override
	CurrencyEntity toEntity(CurrencyDTO dto) {
		CurrencyEntity entity = new CurrencyEntity();
		entity.setCurrencyId(dto.currencyId);
		entity.setCurrencyName(dto.currencyName);
		return entity;
	}

}
