package beans;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void updateSalary(Long employeeId, double amount) {
		Employee employee = employeeDao.find(employeeId);
		employee.setSalary(amount);
		employeeDao.update(employee);
	}

	public Employee getEmployee(long employeeId) {
		return employeeDao.find(employeeId);
	}

	public void updateEmpName(Long employeeId, String name) {
		Employee employee = employeeDao.find(employeeId);
		employee.setEmpName(name);
		employeeDao.update(employee);
		
	}
	
	

}
