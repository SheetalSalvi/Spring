package com.spring.program.first.SpringWorkingProcess;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

//context configuration help to load and run the configuration
//configure the context
@ContextConfiguration(classes = SpringWorkingProcessApplication.class)
//Runner launch the configuration
//run the context
@RunWith(SpringRunner.class)
public class BinarySearchTest {
    //get this bean from context
    @Autowired
    BinarySearchImpl binarySearch;
    @Test
    public void testBasicScenario(){
        //call method on binary search
        int actualResult = binarySearch.BinarySearch(new int[] {},5);
        //check if value is correct
        assertEquals(3,actualResult);

    }
}

/*
1.create test class for the class with is responsible for complete process
2. load/configure the context using @ContextConfiguration
3. Run the context/launch the configuration using @RunWith
Runner will launch up all the configuration and load the bean from context
4. create object for the class for which test class is created and Autowire that class
for proper dependency, using @AutoWired
5.Call the method. using obj.
6. check the expected value and actual result using assertEquals method.

 */