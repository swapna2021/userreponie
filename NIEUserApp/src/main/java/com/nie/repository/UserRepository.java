package com.nie.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nie.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    

}
