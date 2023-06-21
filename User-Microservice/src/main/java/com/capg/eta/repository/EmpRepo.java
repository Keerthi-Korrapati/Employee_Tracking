package com.capg.eta.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.eta.entity.EmpData;

@Repository
public interface EmpRepo extends JpaRepository<EmpData, Long>{

	//EmpData findByempId(String empId);

	List<EmpData> findByEmpIdAndDate(String empId, LocalDate date);
	//EmpData findByEmpIdAndDate1(String empId, LocalDate date);

}
