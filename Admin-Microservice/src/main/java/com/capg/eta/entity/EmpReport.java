package com.capg.eta.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmpReport {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeName;
    private String employeeId;
    private LocalDate date;
    private String content;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public EmpReport(Long id, String employeeName, String employeeId, LocalDate date, String content) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.date = date;
		this.content = content;
	}
	
	public EmpReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "EmpReport [id=" + id + ", employeeName=" + employeeName + ", employeeId=" + employeeId + ", date="
				+ date + ", content=" + content + "]";
	}
    
    

}
