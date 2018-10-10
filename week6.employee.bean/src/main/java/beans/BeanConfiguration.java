package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public EmployeeDao employeeDao() {
		EmployeeDaoInMemoryImpl bean = new EmployeeDaoInMemoryImpl();
		return bean;
	}
	
	@Bean
	public EmployeeService employeeService() {
		EmployeeServiceImpl bean = new EmployeeServiceImpl();
		bean.setEmployeeDao(employeeDao());
		return bean;
	}
	
}
