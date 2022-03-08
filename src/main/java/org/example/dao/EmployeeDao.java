package org.example.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.example.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDao {
    public Employee createEmployee(String employeeJson) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(employeeJson, Employee.class);
    }
}
