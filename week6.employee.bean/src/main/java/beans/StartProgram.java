package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		//AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		
		System.out.println("Before salary update");
		System.out.println("Employee 1 Name & Salary: " + employeeService.getEmployee(1).getEmpName() + " " + employeeService.getEmployee(1).getSalary());
		System.out.println("Employee 1 Name & Salary: " + employeeService.getEmployee(2).getEmpName() + " " + employeeService.getEmployee(2).getSalary());
		
		employeeService.updateSalary(1L,  35000);
		employeeService.updateEmpName(1L,  "Alexander");
		employeeService.updateSalary(2L,  200000);
		employeeService.updateEmpName(2L, "Robert");
		
		System.out.println("Before salary update");
		System.out.println("Employee 1 Name & Salary: " + employeeService.getEmployee(1).getEmpName() + " " + employeeService.getEmployee(1).getSalary());
		System.out.println("Employee 1 Name & Salary: " + employeeService.getEmployee(2).getEmpName() + " " + employeeService.getEmployee(2).getSalary());
	}

}
