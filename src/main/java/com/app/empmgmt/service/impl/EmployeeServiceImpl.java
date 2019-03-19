package com.app.empmgmt.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.empmgmt.entity.Employee;
import com.app.empmgmt.model.EmployeeModel;
import com.app.empmgmt.repository.IEmployeeRepository;
import com.app.empmgmt.service.IEmployeeService;

@Service("EmployeeServiceImpl")
public class EmployeeServiceImpl implements IEmployeeService
{
  
  @Autowired
  private IEmployeeRepository employeeRepository;
  
  @Autowired
  private DozerBeanMapper mapper;
  
  @Override
  public EmployeeModel get ( long id )
  {
    Employee entity = employeeRepository.findById(id).get();
    return mapper.map(entity, EmployeeModel.class);
  }
  
  @Override
  public List<EmployeeModel> getAll ( )
  {
    List<Employee> list = new ArrayList<>();
    employeeRepository.findAll().iterator().forEachRemaining(list::add);
    List<EmployeeModel> retList = new ArrayList<>();
    for(Employee emp : list) retList.add(mapper.map(emp, EmployeeModel.class));
    return retList;
  }
  
  @Override
  public EmployeeModel create ( EmployeeModel model )
  {
    Employee entity = employeeRepository.save(mapper.map(model, Employee.class));
    model = mapper.map(entity, EmployeeModel.class);
    return model;
  }
  
  @Override
  public EmployeeModel update ( long id, EmployeeModel model )
  {
    model.setId(id);
    Employee entity = employeeRepository.save(mapper.map(model, Employee.class));
    model = mapper.map(entity, EmployeeModel.class);
    return model;
  }

  @Override
  public EmployeeModel delete ( long id )
  {
    EmployeeModel model = get(id);
    employeeRepository.deleteById(id);
    return model;
  }
  
}
