package com.yash.em;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

<<<<<<< HEAD
//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
=======
//d@CrossOrigin(origins = "http://13.232.219.107:8082", maxAge = 3600)
>>>>>>> e4f35373d0d74072d4d036abbf766c0de1a87a5e
@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public EmployeeDTO create(@RequestBody EmployeeDTO cNews) {

		return employeeService.create(cNews);
	}

	@GetMapping(path = { "/{id}" })
	public EmployeeDTO findOne(@PathVariable("id") int id) {

		return employeeService.findById(id);
	}
	
	@GetMapping(path = { "/search/{searchValue}" })
	public List<EmployeeDTO> Search(@PathVariable("searchValue") String searchValue) {

		return employeeService.searchEmployee(searchValue);
	}

	@PutMapping
	public EmployeeDTO update(@RequestBody EmployeeDTO cNews) {

		return employeeService.update(cNews);
	}

	@DeleteMapping(path = { "/{id}" })
	public EmployeeDTO delete(@PathVariable("id") int id) {
		return employeeService.delete(id);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<EmployeeDTO> findAll() {

		return employeeService.findAll();
	}

}
