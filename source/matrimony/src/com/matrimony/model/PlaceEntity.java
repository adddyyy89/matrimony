package com.matrimony.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "place")
class PlaceEntity {

	@Id
	@Column(name = "placeid", nullable = false)
	private long placeId;

	@Column(name = "placename", nullable = false, length = 100)
	private String placeName;

	@Column(name = "stateid", nullable = false)
	private int stateId;

	@Column(name = "latitude", nullable = false)
	private int latitude = -1;

	@Column(name = "longitude", nullable = false)
	private int longitude = -1;

	@Transient
	private StateEntity state = null;

	public long getPlaceId() {
		return placeId;
	}

	public void setPlaceId(long placeId) {
		this.placeId = placeId;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public StateEntity getState() {
		return state;
	}

	public void setState(StateEntity state) {
		this.state = state;
	}
}