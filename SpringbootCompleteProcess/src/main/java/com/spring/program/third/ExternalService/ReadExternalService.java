package com.spring.program.third.ExternalService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadExternalService {
    //To read value from external file
    @Value("${external.service.url}")
    String url;

    public String getURL(){
        return url;
    }
}
