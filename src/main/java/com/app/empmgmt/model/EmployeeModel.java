package com.app.empmgmt.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeModel implements Serializable
{
  private static final long serialVersionUID = 5558333327377411295L;
  private long id;
  private String firstName;
  private String lastName;
  private String organisation;
}
