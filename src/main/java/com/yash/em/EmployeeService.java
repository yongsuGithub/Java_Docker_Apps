package com.yash.em;

import java.util.List;


public interface EmployeeService {
	  EmployeeDTO create(EmployeeDTO cNews);

	  EmployeeDTO delete(int id);

	    List<EmployeeDTO> findAll();

	    EmployeeDTO findById(int id);
	    
	    List<EmployeeDTO> searchEmployee(String searchValue);
	  
	  
	    EmployeeDTO update(EmployeeDTO nNews);

}
