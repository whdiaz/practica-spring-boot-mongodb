package com.whdiaztorres.practicamongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.whdiaztorres.practicamongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	

}
