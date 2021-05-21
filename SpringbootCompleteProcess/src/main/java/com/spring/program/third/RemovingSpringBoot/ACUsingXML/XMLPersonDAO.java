package com.spring.program.third.RemovingSpringBoot.ACUsingXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class XMLPersonDAO {

    XMLJDBCConnection xmljdbcConnection;

    public XMLJDBCConnection getXMLJDBCConnection() {
        return xmljdbcConnection;
    }

    public void setXMLJDBCConnection(XMLJDBCConnection xmljdbcConnection) {
        this.xmljdbcConnection = xmljdbcConnection;
    }

    //added some more business logic to check spring testing using Junit and spring-test
    public int findGreatest(){
        int greatest = Integer.MIN_VALUE;
        int[] data = xmljdbcConnection.getData();
        for(int value :data){
            if(value > greatest){
                greatest = value;
            }
        }
        return greatest;
    }

}
