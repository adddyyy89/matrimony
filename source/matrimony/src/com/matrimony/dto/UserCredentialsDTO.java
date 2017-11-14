package com.matrimony.dto;

import java.sql.Timestamp;

public class UserCredentialsDTO {
	public long userId;
	public String emailId;
	public String password;
	public Timestamp registedOn;
	public Timestamp lastLoginOn;
}
