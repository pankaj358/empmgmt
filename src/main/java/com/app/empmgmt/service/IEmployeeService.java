package com.app.empmgmt.service;

import java.util.List;

import com.app.empmgmt.model.EmployeeModel;

public interface IEmployeeService
{
  public EmployeeModel get(long id);
  
  public List<EmployeeModel> getAll();
  
  public EmployeeModel create(EmployeeModel model);
  
  public EmployeeModel update(EmployeeModel model);
}
