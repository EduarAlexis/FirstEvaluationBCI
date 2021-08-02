package com.nisum.exercise5;

import com.nisum.exercise5.models.Employee;
import com.nisum.exercise5.utils.PopulateModel;

import java.util.List;

public class Main {

    /**
     * Haga una función lambda que permita de una lista de empleados, obtener el promedio de las edades de éstos.
     *
     * Puntaje total: 10 puntos
     */
    public static void main(String[] args) {
        List<Employee> employeeList = PopulateModel.populateEmployeeModel();
        System.out.println(averageEmployeeAge(employeeList));
    }

    public static Double averageEmployeeAge(List<Employee> employeeList) {
        return employeeList.stream()
                .mapToDouble(Employee::getAge)
                .average()
                .orElse(Double.NaN);
    }
}
