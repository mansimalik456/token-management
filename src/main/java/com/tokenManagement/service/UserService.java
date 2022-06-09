package com.tokenManagement.service;

import org.springframework.stereotype.Service;

import com.tokenManagement.entity.FCMToken;

@Service
public interface UserService {

//	public Object addDetails(Long userId, FCMToken fcmToken);

	public Object addUserDetails(Long uesrId, String deviceId, String token);

	public Object getUserDetails(Long userId, String deviceId);

	public boolean updateTokenData(Long userId, String deviceId, String token);

}
