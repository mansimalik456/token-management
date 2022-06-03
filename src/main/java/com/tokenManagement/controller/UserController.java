package com.tokenManagement.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tokenManagement.entity.FCMToken;
import com.tokenManagement.repository.UserRepository;
import com.tokenManagement.service.UserService;

@RestController
public class UserController {
	
	@Autowired UserService userService;
	@Autowired UserRepository userRepository;
	

	@PostMapping("/adduserdeatils")
	public ResponseEntity<?> addUserDetails(@RequestParam Long uesrId, @RequestParam String deviceId, @RequestParam String token, @RequestParam boolean isActive){
		Object addUserDetails = userService.addUserDetails(uesrId, deviceId, token, isActive);
		if(Objects.nonNull(addUserDetails)) {
			return new ResponseEntity<>(addUserDetails, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	
//	public ResponseEntity<?> addDetails (@RequestParam Long userId, @RequestBody FCMToken fcmToken){
//		
//		userService.addDetails(userId, fcmToken);
//		
//	}
	

}
