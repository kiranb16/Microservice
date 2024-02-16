package com.codemind.service;

import java.util.List;
import java.util.Optional;

import com.codemind.model.Contact;

public interface ContactService {

	public Contact saveContact(Contact contact);
	
	public List<Contact> findAll();
	
	public Contact getContactById(int cId);
}
