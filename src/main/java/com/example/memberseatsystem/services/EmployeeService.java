package com.example.memberseatsystem.services;
import com.example.memberseatsystem.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    void callStoredProcedureAndInsertData(int param1, String param2);
}
