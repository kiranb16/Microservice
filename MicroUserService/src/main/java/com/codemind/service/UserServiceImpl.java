package com.codemind.service;

import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.codemind.model.Contact;
import com.codemind.model.User;
import com.codemind.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RestTemplate restTemplate;

	private org.slf4j.Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);

	@SuppressWarnings("unchecked")
	@Override public User getUser(int uId) {
		// TODO Auto-generated method stu
		User opUser = userRepository.findById(uId).get();
		logger.info(" in get user By id method in serviceImpl");
		
		Contact getCon =
				this.restTemplate.getForObject("http://CONTACT-SERVICE/getById/" 
+ opUser.getUId(),Contact.class);
		
		opUser.setContacts(getCon);
		return opUser;
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
