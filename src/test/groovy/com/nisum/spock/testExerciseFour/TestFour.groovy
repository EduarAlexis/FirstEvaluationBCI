package com.nisum.spock.testExerciseFour

import com.nisum.exercise4.Main
import spock.lang.Specification
import spock.lang.Subject

class TestFour extends Specification {
    @Subject
    List<Integer> stringList = Arrays.asList(21, 730, 840, 221, 14, 13, 729, 1053, 459)

    def "Prueba lista numeros precedidos de letra e si es par y o si es impar"() {

        when:"Se aplican filtros para determinar la lista de retorno"
        def strings = Main.stringEvenAndOdd(stringList)

        then:"Lista con numeros asociados a letra e u o"
        strings == "'o21, e730, e840, o221, e14, o13, o729, o1053, o459'"
    }
}
