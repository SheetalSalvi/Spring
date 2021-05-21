package com.spring.program.third.RemovingSpringBoot.ACUsingXmlWithComScanAndAnnotation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
public class XMLWithAnnotationJDBCConnection {
     private XMLWithAnnotationJDBCConnection(){
         System.out.println("JDBC Connection");
    }
}
