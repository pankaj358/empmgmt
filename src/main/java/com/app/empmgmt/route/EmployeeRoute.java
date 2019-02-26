package com.app.empmgmt.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.app.empmgmt.model.EmployeeModel;

@Component
public class EmployeeRoute extends RouteBuilder
{
  
  @Override
  public void configure ( ) throws Exception
  {
    restConfiguration()
    .component("servlet")
     .bindingMode(RestBindingMode.json)
      .apiContextPath("/api-doc")
       .apiProperty("api.title", "Employee API")
         .apiProperty("api.version", "1.0.0");
    
    rest()
    .description("Employee Rest Service")
      .consumes("application/json")
        .produces("application/json")
         .get("/employee")
          .description("Find all employee")
           .outType(EmployeeModel[].class)
            .responseMessage()
              .code(200)
               .message("All Employee Successfully returned")
                .endResponseMessage()
                  .to("bean:EmployeeServiceImpl?method=getAll");
    
    rest()
     .description("Employee Rest Service")
      .consumes("application/json")
        .produces("application/json")
         .post("/employee")
          .description("Save Employee Details")
           .outType(EmployeeModel.class)
            .responseMessage()
             .code(200)
              .message("Employee save successfully")
               .endResponseMessage()
                .type(EmployeeModel.class)
                .to("bean:EmployeeServiceImpl?method=create(${body})");
                 
  }
  
}
