package com.Example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Example.Entity.User;
import com.Example.Service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/get")
	public ResponseEntity<String> get() {

		String string = userService.getpostal();

		return new ResponseEntity<String>(string, HttpStatus.OK);

	}

	@PostMapping("/save1")
	public ResponseEntity<User> saveUser(@RequestBody User user) {

		User user2 = userService.saveUser(user);

		return new ResponseEntity<User>(user2, HttpStatus.OK);

	}

}
