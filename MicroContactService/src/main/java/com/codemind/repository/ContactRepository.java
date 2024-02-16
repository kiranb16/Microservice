package com.codemind.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codemind.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
