package com.spring.program.third.RemovingSpringBoot.ACUsingJava;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class JavaPersonDAOTestUsingMockito {
    //create mock for class which has dependency on it.
    //somewhere is we given values or something from database where value is fixed
    // but we want to test it with different values then create mock for that class
    @Mock
    JavaJDBCConnection javaJdbcConnection;
    //bcs we will inject javaJdbcConnection(mock )into javaPersonDAO
    @InjectMocks
    JavaPersonDAO javaPersonDAO;

    @Test
    public void TestGreatestScenerio(){
        //when javaPersonDAO.getData() called then return new int[] {23,26,347}//value to check
        Mockito.when(javaJdbcConnection.getData()).thenReturn(new int[] {12,133,55});
        int actualResult = javaPersonDAO .findGreatest();
        assertEquals(133,actualResult);
    }

    @Test
    public void TestGreatestScenerio_withNovalue(){
        //when javaPersonDAO.getData() called then return new int[] {23,26,347}//value to check
        Mockito.when(javaJdbcConnection.getData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE,javaPersonDAO .findGreatest());
    }
    @Test
    public void TestGreatestScenerio_withEqualValue(){
        //when javaPersonDAO.getData() called then return new int[] {23,26,347}//value to check
        Mockito.when(javaJdbcConnection.getData()).thenReturn(new int[] {2,2});
        assertEquals(2  ,javaPersonDAO .findGreatest());
    }

}
