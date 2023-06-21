package com.capg.eta.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.eta.entity.EmpReport;

@Repository
public interface EmpReportRepository extends JpaRepository<EmpReport, Long>{
	
	List<EmpReport> findByEmployeeName(String employeeName);
    List<EmpReport> findByEmployeeId(String employeeId);
    List<EmpReport> findByDateBetween(LocalDate startDate, LocalDate endDate);
    List<EmpReport> findByEmployeeNameAndDate(String employeeName,LocalDate date);
    List<EmpReport> findByEmployeeNameAndDateBetween(String employeeName,LocalDate startDate, LocalDate endDate);
	//List<EmpReport> findByEmployeeNameDateBetween(String employeeName, LocalDate startDate, LocalDate endDate);

}
