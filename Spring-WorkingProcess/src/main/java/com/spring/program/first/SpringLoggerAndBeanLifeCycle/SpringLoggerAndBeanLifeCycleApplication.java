package com.spring.program.first.SpringLoggerAndBeanLifeCycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan - doubt
public class SpringLoggerAndBeanLifeCycleApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringLoggerAndBeanLifeCycleApplication.class);
	//private static Logger LOGGER = LoggerFactory.getLogger(this.getClass()); - doubt
	public static void main(String[] args) {
	ApplicationContext applicationContext = SpringApplication.run(SpringLoggerAndBeanLifeCycleApplication.class, args);

	PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		System.out.println(personDAO);
		System.out.println(personDAO.getJdbcConnection());
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
	}

}
