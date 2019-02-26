package com.app.empmgmt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.app.empmgmt.entity.Employee;

@Component
public interface IEmployeeRepository extends CrudRepository<Employee, Long>
{
  
}
