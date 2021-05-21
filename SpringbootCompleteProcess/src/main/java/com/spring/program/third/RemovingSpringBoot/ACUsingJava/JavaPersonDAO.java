package com.spring.program.third.RemovingSpringBoot.ACUsingJava;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class JavaPersonDAO {

    @Autowired
    JavaJDBCConnection javaJdbcConnection;

    public JavaJDBCConnection getJavaJdbcConnection() {
        return javaJdbcConnection;
    }

    public void setJavaJdbcConnection(JavaJDBCConnection javaJdbcConnection) {
        this.javaJdbcConnection = javaJdbcConnection;
    }
    //added some more business logic to check spring testing using mockito
public int findGreatest(){
        int greatest = Integer.MIN_VALUE;
        int[] data = javaJdbcConnection.getData();
        for(int value :data){
            if(value > greatest){
                greatest = value;
            }
        }
        return greatest;
}
}
