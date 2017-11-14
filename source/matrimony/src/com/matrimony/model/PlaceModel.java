package com.matrimony.model;

import com.matrimony.dto.PlaceDTO;

public class PlaceModel extends BaseModel<PlaceEntity, PlaceDTO> {

	@Override
	PlaceDTO toDTO(PlaceEntity entity) {
		PlaceDTO dto = new PlaceDTO();
		dto.latitude = entity.getLatitude();
		dto.longitude = entity.getLongitude();
		dto.placeId = entity.getPlaceId();
		dto.placeName = entity.getPlaceName();
		dto.stateId = entity.getStateId();
		return dto;
	}

	@Override
	PlaceEntity toEntity(PlaceDTO dto) {
		PlaceEntity entity = new PlaceEntity();
		entity.setLatitude(dto.latitude);
		entity.setLongitude(dto.longitude);
		entity.setPlaceId(dto.placeId);
		entity.setPlaceName(dto.placeName);
		entity.setStateId(dto.stateId);
		return entity;
	}

}
