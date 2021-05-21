package com.spring.program.third.RemovingSpringBoot.ACUsingXML;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

//context configuration help to load and run the configuration
//configure the context
@ContextConfiguration(locations = "/ApplicationContext.xml")
//Runner launch the configuration
//run the context
@RunWith(SpringRunner.class)
public class XMLPersonDAOTestUsingSpring_test {
    //get this bean from context
    @Autowired
    XMLPersonDAO xmlPersonDAO;

    @Test
    public void TestGreatest(){
        int actualResult = xmlPersonDAO.findGreatest();
        assertEquals(132,actualResult);
        //in this case using junit we can only test 1 test case
        // or if we want to test with different case we need to create method getData() multiple times with different values.
        //that's why we will use mockito
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