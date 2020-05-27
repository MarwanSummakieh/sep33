package com.sep4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sep4.model.Users;

import dao.UsersRepository;

@RestController
@RequestMapping("/sep4")
public class controller {
	@Autowired UsersRepository usersRepository;
	@GetMapping("/hello")
	public ResponseEntity<String> getCustomerById2() {
		Users user = new Users("test","test","test@test.test");
		usersRepository.addUser(user);
		return new ResponseEntity<String>("Hello world", HttpStatus.OK);

	}

}
