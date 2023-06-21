package com.capg.eta.entity;

import java.time.LocalDate; 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmpData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String empId;
	private String empName;
	private String status;
	private LocalDate date;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public EmpData(Long id, String empId, String empName, String status, LocalDate date) {
		super();
		this.id = id;
		this.empId = empId;
		this.empName = empName;
		this.status = status;
		this.date = date;
	}
	
	public EmpData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "EmpData [id=" + id + ", empId=" + empId + ", empName=" + empName + ", status=" + status + ", date="
				+ date + "]";
	}

}
