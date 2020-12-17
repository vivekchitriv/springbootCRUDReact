package in.nareshit.raghu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.exception.EmployeeNotFoundException;
import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Integer saveEmployee(Employee e) {
		Integer id = repo.save(e).getEmpId();
		return id;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = repo.findAll();
		return list;
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		Optional<Employee> opt = repo.findById(id);
		
		Employee emp = opt.orElseThrow(
				()->new EmployeeNotFoundException("Employee not exists")
				);
				
		/*Employee emp = null;
		if(opt.isPresent()) {
			emp = opt.get();
		}
		else {
			throw new EmployeeNotFoundException("Employee not exists");
		}*/
		return emp;
	}

	@Override
	public void deleteEmployee(Integer id) {
		Employee emp = getOneEmployee(id);
		repo.delete(emp);

	}


}
