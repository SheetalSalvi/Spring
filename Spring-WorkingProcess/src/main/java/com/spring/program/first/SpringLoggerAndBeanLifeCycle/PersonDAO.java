package com.spring.program.first.SpringLoggerAndBeanLifeCycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PersonDAO {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringLoggerAndBeanLifeCycleApplication.class);

    @Autowired
    JDBCConnection jdbcConnection;

    public JDBCConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JDBCConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    @PostConstruct
    public void postConstruct(){
        LOGGER.info("Post constructor");
    }

    @PreDestroy
    public void preDestroy(){
        LOGGER.info("Pre Destroy");
    }
}
