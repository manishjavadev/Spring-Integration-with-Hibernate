package com.manish.javadev.spring.manager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manish.javadev.spring.model.Person;
import com.manish.javadev.spring.service.PersonService;

public class SpringDemo {
	public static void main(String[] args) {

		// getting ApplcationContext reference
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		System.out.println("CTX = " + ctx);

		PersonService personService = (PersonService) ctx
				.getBean("personService");

		Person person = new Person("Manish", "India");
		personService.addPerson(person);

	}
}
