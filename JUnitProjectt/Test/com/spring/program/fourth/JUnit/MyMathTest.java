package com.spring.program.fourth.JUnit;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
//test orders are not decides for @Test
//@Ignore //to ignore all test of this class
public class MyMathTest {

    MyMath myMath = new MyMath();
    //use it for junit test
     @Test
     public void sumWith3No(){
         //absence of failure is success
        // fail("not yet implemented");//to fail test
         //we will test sum with 3 no. -> 1 2 3 == 6
       int result =  myMath.sum(new int[] {1,2,3});
       // if want to check that result is 6 so asser come in picture to compare expected value and actual value
        // assertEquals(expected,actual);
         assertEquals(6 ,result);
         System.out.println(result);
     }

    //@Ignore //to ignore this particular method test
     @Test
     public  void sumWith2No(){
         //we will test sum with 2 no. -> 1 3  == 4
         int result = myMath.sum(new int[]{1,3});
         assertEquals(4,result);
         System.out.println(result);
     }
     //before every test
     @Before
    public void before(){
         System.out.println("before");
     }
     //after every test
    @After
    public void after(){
        System.out.println("after");
    }
    //before any class start to execute it's test
    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }
    //after any class ends to execute it's test
    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
    }

}
