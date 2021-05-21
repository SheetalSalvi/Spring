package com.spring.program.first.SpringBeanScope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBeanScopeApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext = SpringApplication.run(SpringBeanScopeApplication.class, args);

	PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		System.out.println(personDAO);
		System.out.println(personDAO1);
		System.out.println(personDAO.getJdbcConnection());
		System.out.println(personDAO1.getJdbcConnection());
		System.out.println(personDAO1.getJdbcConnection());
	}

}
