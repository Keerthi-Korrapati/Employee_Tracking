package com.capg.eta.controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.eta.entity.EmpReport;
import com.capg.eta.service.EmpReportService;

@RestController
@RequestMapping("/reports")
public class ReportController {
	
	@Autowired
	EmpReportService es;
	
	@PostMapping("/addEmployee")
	public String addEmp(
			@RequestBody EmpReport er){
		return es.addEmployee(er);
	}
	
	
	@GetMapping("/daily")
    public List<EmpReport> getDailyReport(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return es.getDailyReport(date);
    }
	
	@GetMapping("/daily-report")
    public List<EmpReport> getDailyReport1(@RequestParam("employeeName") String employeeName,@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return es.getDailyReport1(employeeName,date);
    }

    @GetMapping("/weekly")
    public List<EmpReport> getWeeklyReport(@RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                        @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        return es.getWeeklyReport(startDate, endDate);
    }
    
    @GetMapping("/weekly-report")
    public List<EmpReport> getWeeklyReport1(@RequestParam("employeeName") String employeeName,@RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                        @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        return es.getWeeklyReport1(employeeName,startDate, endDate);
    }

    @GetMapping("/monthly")
    public List<EmpReport> getMonthlyReport(@RequestParam("year") int year,
                                         @RequestParam("month") @DateTimeFormat(pattern = "MM") Month month) {
        return es.getMonthlyReport(year, month);
    }
    
    @GetMapping("/monthly-report")
    public List<EmpReport> getMonthlyReport1(@RequestParam("employeeName") String employeeName,@RequestParam("year") int year,
                                         @RequestParam("month") @DateTimeFormat(pattern = "MM") Month month) {
        return es.getMonthlyReport1(employeeName,year, month);
    }
    
    @GetMapping("/employee")
    public List<EmpReport> getReportByEmployeeName(@RequestParam("employeeName") String employeeName) {
        return es.getReportByEmployeeName(employeeName);
    }

    @GetMapping("/employeeId")
    public List<EmpReport> getReportByEmployeeId(@RequestParam("employeeId") String employeeId) {
        return es.getReportByEmployeeId(employeeId);
    }

}
