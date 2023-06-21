package com.capg.eta.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.eta.entity.EmpReport;
import com.capg.eta.repository.EmpReportRepository;

@Service
public class EmpReportService {
	
	@Autowired
	EmpReportRepository er;

	public String addEmployee(EmpReport er1) {
		er.save(er1);
		return "Flight with ID "+er1.getEmployeeId()+" has been added.";
	}

    public List<EmpReport> getDailyReport(LocalDate date) {
        return er.findByDateBetween(date, date);
    }

    public List<EmpReport> getWeeklyReport(LocalDate startDate, LocalDate endDate) {
        return er.findByDateBetween(startDate, endDate);
    }

    public List<EmpReport> getMonthlyReport(int year, Month month) {
        LocalDate startDate = LocalDate.of(year, month, 1);
        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());
        return er.findByDateBetween(startDate, endDate);
    }
    
    public List<EmpReport> getReportByEmployeeName(String employeeName) {
        return er.findByEmployeeName(employeeName);
    }

    public List<EmpReport> getReportByEmployeeId(String employeeId) {
        return er.findByEmployeeId(employeeId);
    }

	public List<EmpReport> getDailyReport1(String employeeName, LocalDate date) {
		// TODO Auto-generated method stub
		return er.findByEmployeeNameAndDate(employeeName, date);
	}

	public List<EmpReport> getWeeklyReport1(String employeeName, LocalDate startDate, LocalDate endDate) {
		// TODO Auto-generated method stub
		return er.findByEmployeeNameAndDateBetween(employeeName, startDate, endDate);
	}
	
	public List<EmpReport> getAllEmployeeDetails(){
		return er.findAll();
	}

	public List<EmpReport> getMonthlyReport1(String employeeName, int year, Month month) {
		// TODO Auto-generated method stub
		LocalDate startDate = LocalDate.of(year, month, 1);
        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());
		return er.findByEmployeeNameAndDateBetween(employeeName, startDate, endDate);
	}

}
