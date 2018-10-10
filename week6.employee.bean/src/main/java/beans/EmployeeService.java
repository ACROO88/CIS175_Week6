package beans;

public interface EmployeeService {

	public void updateSalary(Long employeeId, double amount);
	public Employee getEmployee(long employeeId);
	public void updateEmpName(Long employeeId, String name);
}
