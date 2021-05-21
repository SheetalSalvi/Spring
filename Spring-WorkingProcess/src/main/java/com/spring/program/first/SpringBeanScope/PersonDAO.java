package com.spring.program.first.SpringBeanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//if we want multiple instance for this class - prototype bean
//but if singleton bean having a prototype dependency then we need to add it to dependency class
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// output JDBCConnection@3f23a3a0 , JDBCConnection@3f23a3a0
public class PersonDAO {

    @Autowired
    BeanScopeJDBCConnection beanScopeJdbcConnection;

    public BeanScopeJDBCConnection getJdbcConnection() {
        return beanScopeJdbcConnection;
    }

    public void setJdbcConnection(BeanScopeJDBCConnection beanScopeJdbcConnection) {
        this.beanScopeJdbcConnection = beanScopeJdbcConnection;
    }

}
