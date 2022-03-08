package org.example.model;

import lombok.Data;

@Data
public class Employee {
    int id;
    String name;
    double salary;
    char gender;

    public Employee(int id, String name, double salary, char gender){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }
}
