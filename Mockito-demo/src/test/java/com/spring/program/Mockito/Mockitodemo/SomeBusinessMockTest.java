package com.spring.program.Mockito.Mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {

    //created mock for interface which needs to be implemented in class for each case everytime.
    //we don't need to give defination of abstract class, we will do it through mock
    DataService dataServiceMock = mock(DataService.class);

    @Test
    public void testFindTheGreatestFromAllData(){
         //dataServiceMock.retriveAllData() => new int[]{24,4,6}
        //when retriveAllData called then return this array.
        when(dataServiceMock.retriveAllData()).thenReturn(new int[] {24,4,6});
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
       int  result =  businessImpl.findTheGreatestFromAllData();
        System.out.println(result);
       assertEquals(6 ,result);
    }
    @Test
    public void testFindTheGreatestFromAllData_WithOneVal(){
        //when retriveAllData() called then return this array.
        when(dataServiceMock.retriveAllData()).thenReturn(new int[] {24});

        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        int  result =  businessImpl.findTheGreatestFromAllData();
        System.out.println(result);
        assertEquals(24 ,result);
    }
}
//if we want to check different test cases then we will need to create this this class implementing interface again and again for every test ,
//so here Mockito came, so we can create class dynamically using mockito, no need to create class again nd again.