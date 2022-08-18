package com.employeemanagement.service;

import com.employeemanagement.dto.request.EmployeeRequest;
import com.employeemanagement.dto.response.EmployeeResponse;

import java.util.List;

public interface EmployeeService {
    EmployeeResponse findEmployeeById(Long id);
    List<EmployeeResponse> findEmployeeList();
    EmployeeResponse createEmployee(EmployeeRequest employeeRequest);
    EmployeeResponse updateEmployee(Long id, EmployeeRequest employeeRequest);
    void deleteEmployeeById(Long id);
}
