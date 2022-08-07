package com.togril.springdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.togril.springdemo.entity.User;


public interface UserRepository extends MongoRepository<User, String> {

}
