package com.nisum.spock.testExerciseThree
import com.nisum.exercise3.Main;
import spock.lang.Specification
import spock.lang.Subject

class TestThree extends Specification{

    @Subject
    List<String> stringList = Arrays.asList("arandanos", "ana", "pepino", "arpegio", "gato", "pepe", "ala")

    def "Prueba lista con nombres que inician con a y tienen logitud 3"() {
        when:"Calculo nombres de longitud 3 que inician con letra a"
        def upperList = Main.stringWithFirstLetterA(stringList)

        then:"Lista con cadenas que inician con letra A y tienen tamaño 3"
        upperList == Arrays.asList("ana", "ala")
    }
}
