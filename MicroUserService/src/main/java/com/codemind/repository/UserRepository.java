package com.codemind.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codemind.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
