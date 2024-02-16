package com.codemind.service;

import java.util.List;
import java.util.Optional;

import com.codemind.model.User;

public interface UserService {

	public User getUser(int uId);

	public User saveUser(User user);
	
	public List<User> getAllUser();
}
