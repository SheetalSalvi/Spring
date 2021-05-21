package com.spring.program.fourth.JUnit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {
    @Test
    public void test(){
        boolean condition = true;
        int val = 2;
        assertEquals(2,2);//pass
        // assertEquals(3,2); //will fail
        assertEquals(true,condition);
        //assertTrue do this in short//to check condition is true
        assertTrue(condition);
        //to check condition is  false
        assertFalse(condition);
        //to check value is not null
        assertNotNull(val);
        //to check value is null
        assertNull(val);
        //assertArrayEquals(expected,actual);
    }
}
