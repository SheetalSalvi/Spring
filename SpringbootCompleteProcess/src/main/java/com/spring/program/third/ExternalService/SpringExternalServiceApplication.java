package com.spring.program.third.ExternalService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Configuration
@ComponentScan
//To load value from external file - we need to read it and load it
//without load output will be ${external.service.url}
@PropertySource("classpath:ExternalService.properties")
public class SpringExternalServiceApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringExternalServiceApplication.class);
	public static void main(String[] args) {
			try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringExternalServiceApplication.class))
		{
		ReadExternalService service = applicationContext.getBean(ReadExternalService.class);
		System.out.println ("Service is = "+service);
		//we can do both - log or sout
			//System.out.println ("loaded service  is = "+service.getURL());
			LOGGER.info("{}",service.getURL());

		}

			}
}
