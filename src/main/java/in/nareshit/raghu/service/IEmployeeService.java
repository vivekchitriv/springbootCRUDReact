package in.nareshit.raghu.service;

import java.util.List;

import in.nareshit.raghu.model.Employee;

public interface IEmployeeService {

	Integer saveEmployee(Employee e);
	List<Employee> getAllEmployees();
	Employee getOneEmployee(Integer id);
	void deleteEmployee(Integer id);
	
}
