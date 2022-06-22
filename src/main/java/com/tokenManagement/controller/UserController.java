package com.tokenManagement.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@PostMapping("/api/adduserdeatils")
	public ResponseEntity<?> addUserDetails(@RequestParam Long uesrId, @RequestParam String deviceId, @RequestParam String token){
		Object addUserDetails = userService.addUserDetails(uesrId, deviceId, token);
		if(Objects.nonNull(addUserDetails)) {
			return new ResponseEntity<>(addUserDetails, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@GetMapping("/api/getUserdetails")
	public ResponseEntity<?> getUserDetails(@RequestParam Long userId, @RequestParam String deviceId){
		
		Object userDetails = userService.getUserDetails(userId, deviceId);
		if(Objects.nonNull(userDetails)) {
			return new ResponseEntity<>(userDetails, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
		
	}
	
	
	@PutMapping("/api/updatetokendata")
	public ResponseEntity<?> updateTokenData(@RequestParam Long userId, @RequestParam String deviceId, @RequestParam String token){	
		boolean updateTokenData = userService.updateTokenData(userId, deviceId, token);
		if(updateTokenData) {
			return new ResponseEntity<>(updateTokenData, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	

}
