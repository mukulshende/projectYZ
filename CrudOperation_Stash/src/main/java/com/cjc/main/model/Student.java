package com.cjc.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student 
{
	@Id
	private int id;
	private String name;
	private String address;
	private String rollno;
	private String email;
	private String phone;
	

}
