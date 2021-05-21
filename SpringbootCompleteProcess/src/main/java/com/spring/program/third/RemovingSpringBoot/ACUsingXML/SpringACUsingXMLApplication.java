package com.spring.program.third.RemovingSpringBoot.ACUsingXML;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class SpringACUsingXMLApplication {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml")) {

			XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);
			System.out.println();
			System.out.println(xmlPersonDAO);
			System.out.println(xmlPersonDAO.getXMLJDBCConnection());
		}

	}
}