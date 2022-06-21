package com.tokenManagement.entity;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("tokendetails")
@Data
public class UserDetails {
	
	@Id
	private String id;
	
	@Indexed(unique = true)
	private Long userId;
	
    private Set<FCMToken> fcmToken;
    
    

}
