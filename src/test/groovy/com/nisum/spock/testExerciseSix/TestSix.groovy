package com.nisum.spock.testExerciseSix

import com.nisum.exercise6.utils.MyMath
import spock.lang.Specification
import spock.lang.Subject

class TestSix extends Specification {

    @Subject
    MyMath ob = new MyMath()

    def "Prueba numero impar"() {
        when: "Calculo numero impar"
        def op = ob.isOdd()
        def ret = ob.checker(op, 5)
        then: "Numero impar"
        ret == true
    }

    def "Prueba numero primo"() {
        when: "Calculo numero primo"
        def op = ob.isPrime()
        def ret = ob.checker(op, 3)
        then: "Numero primo"
        ret == true
    }

    def "Prueba numero palindrome"() {
        when: "Calculo numero palindrome"
        def op = ob.isPalindrome()
        def ret = ob.checker(op, 898)
        then: "Numero palindrome"
        ret == true
    }
}
