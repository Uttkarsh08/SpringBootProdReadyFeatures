package com.uttkarsh.ProdReadyFeatures;

import com.uttkarsh.ProdReadyFeatures.clients.EmployeeClient;
import com.uttkarsh.ProdReadyFeatures.dto.EmployeeDTO;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestClient;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProdReadyFeaturesApplicationTests {

	@Autowired
	private EmployeeClient employeeClient;

	@Test
	@Order(3)
	void getAllEmployees(){
		List<EmployeeDTO> employeeDTOList = employeeClient.getAllEmployees();
		System.out.println(employeeDTOList);
	}

	@Test
	@Order(2)
	void getEmployeeById() {
		EmployeeDTO employee = employeeClient.getEmployeeById(652L);
		System.out.println(employee);
	}

	@Test
	@Order(1)
	void createEmployee() {
		EmployeeDTO employee = new EmployeeDTO(
				null, "Vamsi", "vamsi@gmail.com", 20, "ADMIN", 7000, LocalDate.of(2025, 4, 1), true);
		EmployeeDTO savedEmployee = employeeClient.createEmployee(employee);
		System.out.println(savedEmployee);
	}
}
