package com.tokenManagement.entity;

import lombok.Data;

@Data
public class FCMToken {
	
	private String deviceId;
	
	private String token;
	
	private boolean isActive = true;

}
