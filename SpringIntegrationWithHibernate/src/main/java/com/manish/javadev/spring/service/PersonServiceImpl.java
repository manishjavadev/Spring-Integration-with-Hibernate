package com.manish.javadev.spring.service;

import java.util.List;

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
		this.personDAO.addPerson(person);
	}

	@Transactional
	public void updatePerson(Person person) {
		this.personDAO.updatePerson(person);
	}

	@Transactional
	public List<Person> listPersons() {
		return this.personDAO.listPersons();
	}

	@Transactional
	public Person getPersonById(int id) {
		return this.personDAO.getPersonById(id);
	}

	@Transactional
	public void removePerson(int id) {
		this.personDAO.removePerson(id);
	}
}
