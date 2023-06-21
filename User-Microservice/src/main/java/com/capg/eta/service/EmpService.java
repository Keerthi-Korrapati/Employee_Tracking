package com.capg.eta.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.eta.entity.EmpData;
import com.capg.eta.repository.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	EmpRepo er;
	
	public String addEmployee(EmpData er1) {
		er.save(er1);
		return "Employee with ID "+er1.getId()+" has been added.";
	}
	
	public List<EmpData> getAllEmployeeDetails(){
		return er.findAll();
	}
	
	public EmpData updateDailyStatus(String empId, LocalDate date, String status, String employeeName) {
		List<EmpData> existingStatuses = er.findByEmpIdAndDate(empId, date);

		EmpData dailyStatus;
		if (existingStatuses.isEmpty()) {
			dailyStatus = new EmpData();
			dailyStatus.setEmpId(empId);
			dailyStatus.setDate(date);
			dailyStatus.setEmpName(employeeName);
		} else {
			dailyStatus = existingStatuses.get(0);
		}
		
		dailyStatus.setStatus(status);

		return er.save(dailyStatus);
	}

	public List<EmpData> getDailyStatusesByUserAndDate(String userId, LocalDate date) {
		return er.findByEmpIdAndDate(userId, date);
	}

	/*public EmpData updateStatus(String empId, LocalDate date, EmpData ed) {
		// TODO Auto-generated method stub
		EmpData existingEntity = er.findByEmpIdAndDate(empId,date);
		existingEntity.setStatus(ed.getStatus());
		//ed.setStatus(ed.getStatus());
		return er.save(existingEntity);
	}*/
	
	/*public EmpData updateStatus1(EmpData f) {
		return er.save(f);
	}*/

}
