package com.tokenManagement.repository;

import com.google.common.base.Optional;

import java.util.Set;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tokenManagement.entity.FCMToken;
import com.tokenManagement.entity.UserDetails;

@Repository
public interface UserRepository extends MongoRepository<UserDetails, String> {
	
	Optional <UserDetails> findByUserId(Long userId);

}
