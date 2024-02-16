package com.codemind.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codemind.model.Contact;
import com.codemind.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;
	@PostMapping("/save")
	public Contact saveContact(@RequestBody Contact contact) {
		return contactService.saveContact(contact);
	}
	
	@GetMapping("/all")
	public List<Contact> getAllContact(){
		return contactService.findAll();
	}
	@GetMapping("/getById/{id}")
	public Contact getByIdContact(@PathVariable ("id") int cId){
		return contactService.getContactById(cId);
	}
	
}
