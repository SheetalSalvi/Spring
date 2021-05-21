package com.spring.program.first.CDI;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
//we can't create prototype bean for dependency class if dependent class having prototypeDependecy,
//so we removed proxy
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//output - JDBCConnection@5ab14cb9 ,JDBCConnection@4cb21cb4 ,JDBCConnection@4cb21cb4
public class CDIJDBCConnection {
     private CDIJDBCConnection(){
         System.out.println("JDBC Connection");
    }
}
