package com.spring.program.third.RemovingSpringBoot.ACUsingJava;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//without @CS -error- no qualifying bean of type com.spring.program.third.RemovingSpringBoot.ACUsingJava
@ComponentScan
public class SpringACUsingJavaApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringACUsingJavaApplication.class);
	public static void main(String[] args) {
		//AC for spring boot
	//ApplicationContext applicationContext = SpringApplication.run(SpringACUsingJavaApplication.class, args);
		//AC without spring boot with java - ACAP
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringACUsingJavaApplication.class))
		{
		//bcs ApplicationContext don't have close method to close AC thats why used ACAP to close
		//AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringACUsingJavaApplication.class);

		JavaPersonDAO javaPersonDAO = applicationContext.getBean(JavaPersonDAO.class);
		System.out.println (javaPersonDAO);
		System.out.println(javaPersonDAO.getJavaJdbcConnection());
			applicationContext.close();
			}

			}
}
