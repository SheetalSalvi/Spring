package com.spring.program.Mockito.Mockitodemo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
//Whenever we will use mock annotations then we need to add @RunWith on class
//otherwise application will give Null Pointer Exception
@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationTest {
    //we can do this but we will create mock using @mock annotation
   // DataService dataServiceMock = mock(DataService.class);
     @Mock
    DataService dataServiceMock;
     //injected mock or dataservice class/interfacefor which mock is created,in someBusinessImpl class
    @InjectMocks
    SomeBusinessImpl businessImpl;
    @Test
    public void testFindTheGreatestFromAllData(){
         when(dataServiceMock.retriveAllData()).thenReturn(new int[] {24,4,6});
        //we want to inject dataservice in serviceBusinessImpl - use @InjectMocks
       //SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
       int  result =  businessImpl.findTheGreatestFromAllData();
        System.out.println(result);
       assertEquals(6 ,result);
    }
    @Test
    public void testFindTheGreatestFromAllData_WithOneVal(){
        when(dataServiceMock.retriveAllData()).thenReturn(new int[] {24});
        int  result =  businessImpl.findTheGreatestFromAllData();
        System.out.println(result);
        assertEquals(24 ,result);
       // assertEquals(Integer.MIN_VALUE,result);
    }
}
//if we want to check different test cases then we will need to create this this class implementing interface again and again for every test ,
//so here Mockito came, so we can create class dynamically using mockito, no need to create class again nd again.