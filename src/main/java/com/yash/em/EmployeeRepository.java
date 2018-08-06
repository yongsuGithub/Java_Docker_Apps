package com.yash.em;

import org.springframework.data.repository.Repository;

import java.util.List;



public interface EmployeeRepository  extends Repository<EmployeeDTO, Integer>{
	 void delete(EmployeeDTO cNews);

	    List<EmployeeDTO> findAll();

	    List<EmployeeDTO> findOne(int id);
	    
	    List<EmployeeDTO> findByNameIgnoreCaseContaining(String name);
	    
	    List<EmployeeDTO> findByLocationIgnoreCaseContaining(String location);

	    EmployeeDTO save(EmployeeDTO cNews);
}
