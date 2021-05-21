package com.spring.program.first.SpringBeanScope;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//for singleton we don't need to define @scope bcs that is default
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)//1 same instance for all Application Context
//if dependency of a bean having prototype bean //1 instance per Application Context/per Request
//different instance of each request then
//--------@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//------>
// output JDBCConnection@3f23a3a0 , JDBCConnection@4ab14ce2
//using this we will not get different bean/instance for dependency bean on each request
// but using this we can get multiple instance of dependency which have dependency on other class
// exm. persondao having dependency on jdbcConnection// so we can add it on persondao
//but for this class(as it is dependency of other class) we need to add proxy for this
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
//output - JDBCConnection@5ab14cb9 ,JDBCConnection@5ab14cb9 ,JDBCConnection@5ab14cb9
public class BeanScopeJDBCConnection {
     private BeanScopeJDBCConnection(){
         System.out.println("JDBC Connection");
    }
}
