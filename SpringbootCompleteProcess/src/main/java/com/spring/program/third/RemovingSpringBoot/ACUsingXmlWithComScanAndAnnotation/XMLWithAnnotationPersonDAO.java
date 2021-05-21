package com.spring.program.third.RemovingSpringBoot.ACUsingXmlWithComScanAndAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class XMLWithAnnotationPersonDAO {

    @Autowired
    XMLWithAnnotationJDBCConnection xmlWithAnnotationJDBCConnection;

    public XMLWithAnnotationJDBCConnection getXmlWithAnnotationJDBCConnection() {
        return xmlWithAnnotationJDBCConnection;
    }

    public void setXmlWithAnnotationJDBCConnection(XMLWithAnnotationJDBCConnection xmlWithAnnotationJDBCConnection) {
        this.xmlWithAnnotationJDBCConnection = xmlWithAnnotationJDBCConnection;
    }

}
