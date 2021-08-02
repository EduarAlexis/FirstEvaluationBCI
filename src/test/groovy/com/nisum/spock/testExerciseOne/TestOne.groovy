package com.nisum.spock.testExerciseOne

import com.nisum.exercise1.Main;
import spock.lang.Specification

class TestOne extends Specification{

    def "Prueba numeros de lista al cuadrado"() {
        given: "Lista de numeros"
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        List<Integer> acoupleNumList = Arrays.asList(4, 16, 36, 64, 100)

        when:"lista con numeros al cuadrado"
        def testOne = Main.alCuadradoYListaPares(numbers)

        then:"Lista de numeros pares al cuadrado"
        acoupleNumList == testOne
    }
}
