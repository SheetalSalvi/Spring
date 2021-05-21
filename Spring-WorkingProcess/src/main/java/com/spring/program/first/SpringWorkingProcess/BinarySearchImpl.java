package com.spring.program.first.SpringWorkingProcess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class BinarySearchImpl {

    @Autowired
    //if this is not added then @primary will work and will autowire that class who has @prrimary tag
    @Qualifier("Quick")
SortAlgorithm sortAlgorithm;
    //Constructor
    /*public BinarySearchImpl(SortAlgorithm sortAlgorithm){
        this.sortAlgorithm = sortAlgorithm;
    }*/
//Setter
   /* public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/
    public int BinarySearch(int [] numbers,int num){
        numbers = sortAlgorithm.Sort(new int[]{1,4,3,5});
        //code to search no.
        return 3;
    }
}
