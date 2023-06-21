package com.capg.eta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.eta.entity.EmpData;
import com.capg.eta.service.EmpService;

@RestController
@RequestMapping("/user")
public class EmpController {
	
	@Autowired
	EmpService es;
	
	@PostMapping("/addEmployee")
	public String addEmployee(
			@RequestBody EmpData ed){
		return es.addEmployee(ed);
	}
	
	@GetMapping("/get-all-Employees")
	public List<EmpData> getAllEmployees(){
		return es.getAllEmployeeDetails();
	}
	
	@PostMapping("/updateStatus")
    public EmpData updateDailyStatus(@RequestBody EmpData request) {
        return es.updateDailyStatus(request.getEmpId(), request.getDate(), request.getStatus(), request.getEmpName());
    }
	
	/*@PostMapping("/updateStatus")
	public EmpData updateDailyStatus(@RequestParam("empId") String empId,
			@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
		return es.updateDailyStatus(empId, date);
	}*/

	/*@PutMapping("/updateStatus")
	public EmpData updateDailyStatus(@RequestParam("empId") String empId,@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,@RequestBody EmpData ed) {
		return es.updateStatus(empId,date,ed);
	}*/
	

}
