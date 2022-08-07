package com.togril.springdemo.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.togril.springdemo.entity.User;
import com.togril.springdemo.repository.UserRepository;


@RestController
@RequestMapping("/kisiler")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void init() {
		User user = new User();
		user.setName("Kazım");
		user.setSurname("ÇAKIRER");
		userRepository.save(user);
	}

	@GetMapping(value = {"/ekle"} )
	public ResponseEntity<User> ekle(@RequestBody User user) {
		return ResponseEntity.ok(userRepository.save(user));

	}

	@GetMapping(value = {"/listle"})
	public ResponseEntity<List<User>> tumunuListele() {
		return ResponseEntity.ok(userRepository.findAll());
	}
}
