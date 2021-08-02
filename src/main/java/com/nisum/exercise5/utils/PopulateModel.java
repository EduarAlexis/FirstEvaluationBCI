package com.nisum.exercise5.utils;

import com.nisum.exercise5.models.Employee;

import java.util.Arrays;
import java.util.List;

public class PopulateModel {

    public static List<Employee> populateEmployeeModel() {
        Employee employee1 = Employee.builder().id(1).age(30).firstName("Juan").lastName("Perez").position("SemiSenior").build();
        Employee employee2 = Employee.builder().id(1).age(25).firstName("Manuel").lastName("Pereira").position("Trainee").build();
        Employee employee3 = Employee.builder().id(1).age(40).firstName("Gonzalo").lastName("Gutierrez").position("Senior").build();
        Employee employee4 = Employee.builder().id(1).age(31).firstName("Alejandro").lastName("Contreras").position("Senior").build();
        Employee employee5 = Employee.builder().id(1).age(25).firstName("Gustavo").lastName("Vivallos").position("SemiSenior").build();
        Employee employee6 = Employee.builder().id(1).age(28).firstName("Gabriel").lastName("Urso").position("Junior").build();
        Employee employee7 = Employee.builder().id(1).age(35).firstName("Marcelo").lastName("Barra").position("Technical Leader").build();

        return Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6, employee7);
    }
}