package com.spring.program.first.CDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//for CDI application we will add inject dependency to pom.xml
@SpringBootApplication
public class SpringCDIApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext = SpringApplication.run(SpringCDIApplication.class, args);

	CDIPersonDAO CDIPersonDAO = applicationContext.getBean(CDIPersonDAO.class);
		CDIPersonDAO CDIPersonDAO1 = applicationContext.getBean(CDIPersonDAO.class);
		System.out.println(CDIPersonDAO);
		System.out.println(CDIPersonDAO1);
		System.out.println(CDIPersonDAO.getCDIJDBCConnection());
		System.out.println(CDIPersonDAO1.getCDIJDBCConnection());
		System.out.println(CDIPersonDAO1.getCDIJDBCConnection());
	}

}
//add dependency to pom.xml
/*<dependency>
<groupId>javax.inject</groupId>
<artifactId>javax.inject</artifactId>
<version>1</version>
</dependency>*/