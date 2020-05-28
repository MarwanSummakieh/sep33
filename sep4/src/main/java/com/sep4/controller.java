package com.sep4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sep4.model.Users;

@RestController
@RequestMapping("/sep4")
public class controller {

	@Autowired
	UserService service;

	@GetMapping("/getUsers")
	public ResponseEntity<List<Users>> getCustomerBy() {
		List<Users> userList = service.findAll();
		System.out.println("done ");

		return new ResponseEntity<List<Users>>(userList, HttpStatus.OK);

	}

	@PostMapping("/postUser")
	public String postCustomerById2(@RequestBody Users user) {
		Users user1 = new Users(user.getUsername(), user.getPassword(), user.getEmail());
		service.postUser(user1);
		return "Done";

	}

	@GetMapping("/getUser")
	public ResponseEntity<Users> getCustomerByUsername(@RequestParam("username") String username) {

		Users user = service.getUserByUsername(username);

		return new ResponseEntity<Users>(user, HttpStatus.OK);

	}

} 
 
