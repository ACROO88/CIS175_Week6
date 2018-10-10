package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDaoInMemoryImpl implements EmployeeDao{
	
	private Map<Long, Employee> employeesMap = new HashMap<Long, Employee>();
	
	{
		Employee emp1 = new Employee(1L, "Alex", 70000, "IA");
		Employee emp2 = new Employee(2L, "Bob", 100000, "MN");
		
		employeesMap.put(emp1.getId(), emp1);
		employeesMap.put(emp2.getId(), emp2);
	}
	
	public void insert(Employee employee) {
		employeesMap.put(employee.getId(), employee);
		
	}

	public void update(Employee employee) {
		employeesMap.put(employee.getId(), employee);
		
	}

	public void update(List<Employee> employees) {
		for(Employee employee:employees) {
			update(employee);
		}
		
	}

	public void delete(long employeeId) {
		employeesMap.remove(employeeId);
		
	}

	public Employee find(long employeeId) {
		
		return employeesMap.get(employeeId);
	}

	public List<Employee> find(List<Long> employeeIds) {
		List<Employee>employees = new ArrayList<Employee>();
		for(Long id: employeeIds) {
			employees.add(employeesMap.get(id));
		}
		return employees;
	}

	public List<Employee> find(String empName) {
		List<Employee> employees = new ArrayList<Employee>();
		for(Employee employee: employeesMap.values()) {
			if(empName.equals(employee.getEmpName())) {
				employees.add(employee);
			}
		}
		return employees;
	}

	public List<Employee> find(boolean locked) {
		List<Employee> employees = new ArrayList<Employee>();
		for(Employee employee: employeesMap.values()) {
			if(locked == (employee.isLocked())) {
				employees.add(employee);
			}
		}
		return employees;
	}
	
	
}
