package com.nisum.spock.testExerciseTwo

import com.nisum.exercise2.Main;
import spock.lang.Specification
import spock.lang.Subject

class TestTwo extends Specification{

    @Subject
    private List<String> stringList = Arrays.asList("juan", "manzana", "paralelepipedo", "pedro", "piña", "senior developer", "amargado")
    @Subject
    private List<Integer> integerList = Arrays.asList(56, 61, 8, 21, 50, 30, 110, 784, 88)

    def "Prueba lista palabras en mayuscula"() {

        when:"Calculo para lista upperCase"
        def upperList = Main.upperCaseList(stringList)

        then:"Lista con cadenas en upperCase"
        upperList == Arrays.asList("JUAN", "MANZANA", "PARALELEPIPEDO", "PEDRO", "PIÑA", "SENIOR DEVELOPER", "AMARGADO")
    }

    def "Prueba promedio de una lista de numeros enteros"() {

        when:"lista con numeros al cuadrado"
        def averageNummber = Main.averageList(integerList)

        then:"Promedio de la lista de numeros"
        averageNummber == new Double(134.22222222222223)
    }
}
