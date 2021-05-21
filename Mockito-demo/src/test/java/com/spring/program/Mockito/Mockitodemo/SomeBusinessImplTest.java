package com.spring.program.Mockito.Mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessImplTest {

    @Test
    public void testFindTheGreatestFromAllData(){
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
       int  result =  businessImpl.findTheGreatestFromAllData();
        System.out.println(result);
       assertEquals(9,result);
    }
}

class DataServiceStub implements DataService
{
    @Override
    public int[] retriveAllData()
    {
        return new int[]{2,18,9};
    }
}
//if we want to check different test cases then we will need to create this this class implementing interface again and again for every test ,
//so here Mockito came, so we can create class dynamically using mockito, no need to create class again nd again.