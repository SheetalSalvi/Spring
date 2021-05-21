package com.spring.program.first.SpringWorkingProcess;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//we give it on class to give that preference dependency among all dependency
// can be added on a single class in whole project, otherwise it will give error in finding dependency
//can be added on all class only if we have used qualified on any class
//@Primary
//can be added on multiple class but only those class bean will create whose @qualifier we added during autowiring
@Qualifier("Quick")//having high preference among this 3 annotations
public class QuickSortAlgorithm implements SortAlgorithm{
    public int[] Sort(int [] numbers){
        //code for sorting
        return numbers;
    }
}
