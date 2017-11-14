package com.matrimony.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails")
class UserDetailsEntity implements Serializable {

	private static final long serialVersionUID = -3088634471051876068L;

	@Id
	@Column(name = "userid", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;

	@Column(name = "firstname", nullable = false, length = 30)
	private String firstName;

	@Column(name = "lastname", nullable = false, length = 30)
	private String lastName;

	@Column(name = "mobileno", nullable = false)
	private long mobileNo;

	@Column(name = "isverifiedmobileno")
	private boolean isVerifiedMobileNo;

	@Column(name = "genderid", nullable = false)
	private short genderId;

	@Column(name = "dateofbirth", nullable = false)
	private Date dob;

	@Column(name = "addressline1", nullable = false, length = 100)
	private String addressLine1;

	@Column(name = "addressline2", length = 100)
	private String addressLine2;

	@Column(name = "placeid", nullable = false)
	private long placeId;

	@Column(name = "pincode", nullable = false)
	private int pincode;

	@Column(name = "profilepicturepath", length = 100)
	private String profilePicturePath;

	@Column(name = "isdeleted", nullable = false)
	private boolean isDeleted;

	@Column(name = "maritalstatusid", nullable = false)
	private short maritalStatusId;

	@Column(name = "height")
	private int height;

	@Column(name = "familytypeid")
	private short familyTypeId;

	@Column(name = "physicaldisability", nullable = false)
	private boolean physicalDisability;

	@Column(name = "educationid", nullable = false)
	private int educationId;

	@Column(name = "employmentid", nullable = false)
	private short employmentId;

	@Column(name = "occupationid", nullable = false)
	private int occupationId;

	@Column(name = "income", nullable = false)
	private long income;

	@Column(name = "incomecurrencyid", nullable = false)
	private int incomeCurrencyId;

	@Column(name = "citizenshipid")
	private short citizenshipId;

	@Column(name = "worklocation")
	private short workLocation;

	@Column(name = "aboutme", length = 1000)
	private String aboutMe;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public boolean isVerifiedMobileNo() {
		return isVerifiedMobileNo;
	}

	public void setVerifiedMobileNo(boolean isVerifiedMobileNo) {
		this.isVerifiedMobileNo = isVerifiedMobileNo;
	}

	public short getGenderId() {
		return genderId;
	}

	public void setGenderId(short genderId) {
		this.genderId = genderId;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public long getPlaceId() {
		return placeId;
	}

	public void setPlaceId(long placeId) {
		this.placeId = placeId;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getProfilePicturePath() {
		return profilePicturePath;
	}

	public void setProfilePicturePath(String profilePicturePath) {
		this.profilePicturePath = profilePicturePath;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public short getMaritalStatusId() {
		return maritalStatusId;
	}

	public void setMaritalStatusId(short maritalStatusId) {
		this.maritalStatusId = maritalStatusId;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public short getFamilyTypeId() {
		return familyTypeId;
	}

	public void setFamilyTypeId(short familyTypeId) {
		this.familyTypeId = familyTypeId;
	}

	public boolean isPhysicalDisability() {
		return physicalDisability;
	}

	public void setPhysicalDisability(boolean physicalDisability) {
		this.physicalDisability = physicalDisability;
	}

	public int getEducationId() {
		return educationId;
	}

	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}

	public short getEmploymentId() {
		return employmentId;
	}

	public void setEmploymentId(short employmentId) {
		this.employmentId = employmentId;
	}

	public int getOccupationId() {
		return occupationId;
	}

	public void setOccupationId(int occupationId) {
		this.occupationId = occupationId;
	}

	public long getIncome() {
		return income;
	}

	public void setIncome(long income) {
		this.income = income;
	}

	public int getIncomeCurrencyId() {
		return incomeCurrencyId;
	}

	public void setIncomeCurrencyId(int incomeCurrencyId) {
		this.incomeCurrencyId = incomeCurrencyId;
	}

	public short getCitizenshipId() {
		return citizenshipId;
	}

	public void setCitizenshipId(short citizenshipId) {
		this.citizenshipId = citizenshipId;
	}

	public short getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(short workLocation) {
		this.workLocation = workLocation;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

}
