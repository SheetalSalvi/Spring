package com.spring.program.third.RemovingSpringBoot.ACUsingXmlWithComScanAndAnnotation;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class SpringXMLWithAnnotationApplication {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext =new ClassPathXmlApplicationContext("ApplicationContextWithCSAndAnnotation.xml")) {

			XMLWithAnnotationPersonDAO xmlWithAnnotationPersonDAO = applicationContext.getBean(XMLWithAnnotationPersonDAO.class);
			System.out.println(xmlWithAnnotationPersonDAO);
			System.out.println(xmlWithAnnotationPersonDAO.getXmlWithAnnotationJDBCConnection());
		}

	}
}