package com.tokenManagement.entity;

import java.util.Objects;

import lombok.Data;

@Data
public class FCMToken {
	
	private String deviceId;
	
	private String token;
	
	private boolean isActive = true;

	
	public boolean equals(Object obj, String str) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FCMToken other = (FCMToken) obj;
		return Objects.equals(deviceId, other.deviceId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(deviceId);
	}

	
	

}
