package com.uttkarsh.ProdReadyFeatures.clients;

import com.uttkarsh.ProdReadyFeatures.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeClient {

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO getEmployeeById(Long employeeId);

    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

}
