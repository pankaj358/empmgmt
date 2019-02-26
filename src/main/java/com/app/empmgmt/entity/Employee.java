package com.app.empmgmt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Entity
@Table(name="employee")
@Data
public class Employee
{
  @Id
  @GeneratedValue(generator="employee_generator")
  @SequenceGenerator(name="employee_generator", sequenceName="employee_sequence", initialValue=1000)
  private Long id;
  
  @NotBlank
  @Column(name="first_name")
  private String firstName;
  
  @NotBlank
  @Column(name="last_name")
  private String lastName;
}
