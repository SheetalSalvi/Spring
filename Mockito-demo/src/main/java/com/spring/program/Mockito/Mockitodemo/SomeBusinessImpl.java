package com.spring.program.Mockito.Mockitodemo;

public class SomeBusinessImpl {
    public DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    //get greatest among all data
    public int findTheGreatestFromAllData(){
        int[] data = dataService.retriveAllData();
        int greatest = Integer.MIN_VALUE;

        for(int value : data){
            greatest = value;
        }
        return greatest;
    }
}
