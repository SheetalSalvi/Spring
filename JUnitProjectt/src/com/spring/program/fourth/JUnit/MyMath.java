package com.spring.program.fourth.JUnit;

public class MyMath {
    int sum(int [] numbers)
    {
        int sum = 0;
        for (int i:numbers) {
            sum = sum + i;
        }
        return  sum;
        //if someone change code in between of testing then
        //test case will start failing
        //return sum + 20;
    }
}
