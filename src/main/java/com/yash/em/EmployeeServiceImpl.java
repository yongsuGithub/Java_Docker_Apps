package com.yash.em;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	@Override
	public EmployeeDTO create(EmployeeDTO cNews) {

		return repository.save(cNews);
	}

	@Override
	public EmployeeDTO delete(int id) {
		EmployeeDTO user = findById(id);
		if (user != null) {
			repository.delete(user);
		}        
		return user;
	}

	@Override
	public List<EmployeeDTO> findAll() {
		return repository.findAll();
	}

	@Override
	public EmployeeDTO findById(int id) {
		return repository.findOne(id).get(0);
		//return null;
	}

	@Override
	public EmployeeDTO update(EmployeeDTO nNews) {

		return repository.save(nNews);
	}

	@SuppressWarnings("unused")
	@Override
	public List<EmployeeDTO> searchEmployee(String searchValue) {
		List<EmployeeDTO> temp = null;
		temp = repository.findByNameIgnoreCaseContaining(searchValue);
		if (temp.size()==0) {
			temp = repository.findByLocationIgnoreCaseContaining(searchValue);
		} 
		if (temp.size()==0) {
			int id = 0;
			try {
				id = Integer.parseInt(searchValue);
			} catch (Exception e) {
				return temp;
			}
			temp = repository.findOne(id);
		}
		return temp;

	}

}
