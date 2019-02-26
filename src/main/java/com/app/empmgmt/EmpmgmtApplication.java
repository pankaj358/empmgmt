package com.app.empmgmt;

import java.util.Collections;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmpmgmtApplication
{
  
  public static void main ( String[] args )
  {
    SpringApplication.run(EmpmgmtApplication.class, args);
  }
  
  @Bean
  public DozerBeanMapper dozerBean()
  {
    DozerBeanMapper dozerBean= new DozerBeanMapper();
    dozerBean.setMappingFiles(Collections.singletonList("dozerJdk8Converters.xml"));
    return dozerBean;
  }
}
