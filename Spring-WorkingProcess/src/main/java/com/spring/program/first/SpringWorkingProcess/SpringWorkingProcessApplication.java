package com.spring.program.first.SpringWorkingProcess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringWorkingProcessApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext = SpringApplication.run(SpringWorkingProcessApplication.class, args);
	//autowiring using constructor(constructor injection) created constructor in BinarySearchImpl
	//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//autoWiring using Setter(setter injection) for this created a setter in BinarySearchImpl
		//to get all the beans by finding @component tag
		//but in new features of spring we don't need setter getter as required
		// we can create dependency directly dependency class object in dependent class
		// and by adding @Autowire on it,even without setter it will work same.
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch.sortAlgorithm);
	}

}
