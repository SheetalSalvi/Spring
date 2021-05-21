package com.spring.program.third.RemovingSpringBoot.ACUsingXML;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

public class XMLJDBCConnection {
     private XMLJDBCConnection(){
         System.out.println("JDBC Connection");
    }

    //added some more business logic to check spring testing using junit and spring-test
    public int[] getData(){
        return new int[]{4,88,132};
    }
}
