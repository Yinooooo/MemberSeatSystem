package com.example.memberseatsystem.services;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.memberseatsystem.entities.Employee;
import com.example.memberseatsystem.repositories.EmployeeRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void callStoredProcedureAndInsertData(int param1, String param2) {
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("your_stored_procedure_name");

        storedProcedureQuery.registerStoredProcedureParameter("param1", Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("param2", String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter("param1", param1);
        storedProcedureQuery.setParameter("param2", param2);

        storedProcedureQuery.execute();
    }
}
