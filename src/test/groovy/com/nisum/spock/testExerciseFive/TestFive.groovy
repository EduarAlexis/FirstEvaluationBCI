package com.nisum.spock.testExerciseFive

import com.nisum.exercise5.Main
import com.nisum.exercise5.models.Employee
import com.nisum.exercise5.utils.PopulateModel
import spock.lang.Specification
import spock.lang.Subject

class TestFive extends Specification{
    @Subject
    List<Employee> employeeList = PopulateModel.populateEmployeeModel()

    def "Prueba promedio edades de los empleados en lista"() {

        when:"Prueba calculo de promedio"
        def employeeAge = Main.averageEmployeeAge(employeeList)

        then:"Promedio edad empleados"
        employeeAge == new Double(30.571428571428573)
    }
}
