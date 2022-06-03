package com.tokenManagement.serviceImp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;
import com.tokenManagement.entity.FCMToken;
import com.tokenManagement.entity.UserDetails;
import com.tokenManagement.repository.UserRepository;
import com.tokenManagement.service.UserService;

@Service
public class UserServiceImp implements UserService{

	@Autowired UserRepository userRepository;
	
	@Override
	public Object addUserDetails(Long uesrId, String deviceId, String token, boolean isActive) {
		
	Optional<UserDetails> getUserId = userRepository.findByUserId(uesrId);
	
		if(getUserId.isPresent()) {
			UserDetails userDetails = getUserId.get();
			Set<FCMToken> listOfFcmToken = userDetails.getFcmToken();
			listOfFcmToken.removeIf(fcmData-> fcmData.getDeviceId().equals(deviceId));
			FCMToken fcmToken = new FCMToken();
			fcmToken.setDeviceId(deviceId);
			fcmToken.setToken(token);
			fcmToken.setActive(isActive);
			listOfFcmToken.add(fcmToken);
			userDetails.setFcmToken(listOfFcmToken);
			return userRepository.save(userDetails);
		} 	
		else{
			UserDetails user = new UserDetails();
			user.setUserId(uesrId);
			Set<FCMToken> fcmToken = new HashSet<>();
			FCMToken tokens = new FCMToken();
			tokens.setDeviceId(deviceId);
			tokens.setToken(token);
			tokens.setActive(isActive);
			fcmToken.add(tokens);
			user.setFcmToken(fcmToken);
			return userRepository.save(user);
		}

	}
	

}
