package com.spring.program.first.CDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;


@Named
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// output JDBCConnection@3f23a3a0 , JDBCConnection@3f23a3a0
public class CDIPersonDAO {

    @Inject
    CDIJDBCConnection CDIjdbcConnection;

    public CDIJDBCConnection getCDIJDBCConnection() {
        return CDIjdbcConnection;
    }

    public void setCDIJDBCConnection(CDIJDBCConnection CDIjdbcConnection) {
        this.CDIjdbcConnection = CDIjdbcConnection;
    }

}
