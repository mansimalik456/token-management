package com.tokenManagement.serviceImp;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

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
	public Object addUserDetails(Long uesrId, String deviceId, String token) {
		
	Optional<UserDetails> getUserId = userRepository.findByUserId(uesrId);
	
		if(getUserId.isPresent()) {
			UserDetails userDetails = getUserId.get();
			Set<FCMToken> listOfFcmToken = userDetails.getFcmToken();
		//	listOfFcmToken.removeIf(fcmData-> fcmData.getDeviceId().equals(deviceId));
			FCMToken fcmToken = new FCMToken();
			fcmToken.setDeviceId(deviceId);
			fcmToken.setToken(token);
			fcmToken.setActive(true);
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
			tokens.setActive(true);
			fcmToken.add(tokens);
			user.setFcmToken(fcmToken);
			return userRepository.save(user);
		}

	}

	
//	@Override
//	public Object addUserDetails(Long uesrId, String deviceId, String token) {
//		
//	Optional<UserDetails> getUserId = userRepository.findByUserId(uesrId);
//	
//		if(getUserId.isPresent()) {
//			UserDetails userDetails = getUserId.get();
//			Set<FCMToken> listOfFcmToken = userDetails.getFcmToken();
//			
//			if(listOfFcmToken.contains(deviceId)) {
//				
//				listOfFcmToken.stream()
//				.filter(obj -> obj.getDeviceId().hashCode() == deviceId.hashCode()).
//				findFirst().get().setToken(token);
//				
//				userDetails.setFcmToken(listOfFcmToken);
//				return userRepository.save(userDetails);
//			}else {
//				FCMToken fcmToken = new FCMToken();
//				fcmToken.setDeviceId(deviceId);
//				fcmToken.setToken(token);
//				fcmToken.setActive(true);
//				listOfFcmToken.add(fcmToken);
//				userDetails.setFcmToken(listOfFcmToken);
//				return userRepository.save(userDetails);
//			}
//		}else{
//			UserDetails user = new UserDetails();
//			user.setUserId(uesrId);
//			Set<FCMToken> fcmToken = new HashSet<>();
//			FCMToken tokens = new FCMToken();
//			tokens.setDeviceId(deviceId);
//			tokens.setToken(token);
//			tokens.setActive(true);
//			fcmToken.add(tokens);
//			user.setFcmToken(fcmToken);
//			return userRepository.save(user);
//		}
//
//	}
//	
	
	@Override
	public Object getUserDetails(Long userId, String deviceId) {
		Optional<UserDetails> userIdData = userRepository.findByUserId(userId);
		if(userIdData.isPresent()) {
			UserDetails userDetails = userIdData.get();
			Set<FCMToken> fcmToken = userDetails.getFcmToken();
			return fcmToken;
		}
		return null;
	}

	
	@Override
	public boolean updateTokenData(Long userId, String deviceId, String token) {
		Optional<UserDetails> getUserId = userRepository.findByUserId(userId);
		if(getUserId.isPresent()) {
			UserDetails userDetails = getUserId.get();
			Set<FCMToken> fcmToken = userDetails.getFcmToken();
			
			fcmToken.stream()
			.filter(obj -> obj.getDeviceId().hashCode() == deviceId.hashCode()).
			findFirst().get().setToken(token);
			
			userDetails.setFcmToken(fcmToken);
			userRepository.save(userDetails);
			return true;
		}
		return false;
	}
	

}
