package com.spring.program.first.SpringLoggerAndBeanLifeCycle;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
 public class JDBCConnection {
     private JDBCConnection(){
         System.out.println("JDBC Connection");
    }
}
