package com.spring.program.third.RemovingSpringBoot.ACUsingJava;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
public class JavaJDBCConnection {
     private JavaJDBCConnection(){
         System.out.println("JDBC Connection");
    }

    //added some more business logic to check spring testing using mockito
  public int[] getData(){
         return new int[]{4,88,32};
  }
}