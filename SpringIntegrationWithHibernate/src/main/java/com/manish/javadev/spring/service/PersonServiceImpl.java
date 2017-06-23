package com.manish.javadev.spring.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manish.javadev.spring.dao.PersonDAO;
import com.manish.javadev.spring.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Transactional
	public void addPerson(Person person) {
		System.out.println(person);
		System.out.println("personDAO = " + personDAO);
		this.personDAO.addPerson(person);
	}

	@Transactional
	public void updatePerson(Person person) {
		this.personDAO.updatePerson(person);
	}

}
