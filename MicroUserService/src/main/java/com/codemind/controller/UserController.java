package com.codemind.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.codemind.model.Contact;
import com.codemind.model.User;
import com.codemind.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/all")
	public List<User> getAllUser(){
		List<User> user =userService.getAllUser();
		 // List<Contact> con= restTemplate.getForObject("http://localhost:8081/all", List.class);
		 // user.set(0, (User) con);
		  return user;
	}
	
     
	@GetMapping("/user/byid/{id}")
	public User getById(@PathVariable("id") int uId ){
		
			User user= userService.getUser(uId);
			// localhost:8081/getById/1
			//List<Contact> contacts=restTemplate.getForObject("http://localhost:8082/getById/"+user.getUId(), List.class);
			//   user.setContacts(contacts);
			return user;
	}
	
	
}
