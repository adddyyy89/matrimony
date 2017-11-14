package com.matrimony.model;

import com.matrimony.dto.StateDTO;

public class StateModel extends BaseModel<StateEntity, StateDTO> {

	@Override
	StateDTO toDTO(StateEntity entity) {
		StateDTO dto = new StateDTO();
		dto.countryId = entity.getCountryId();
		dto.stateId = entity.getStateId();
		dto.stateName = entity.getStateName();
		return dto;
	}

	@Override
	StateEntity toEntity(StateDTO dto) {
		StateEntity entity = new StateEntity();
		entity.setCountryId(dto.countryId);
		entity.setStateId(dto.stateId);
		entity.setStateName(dto.stateName);
		return entity;
	}

}
