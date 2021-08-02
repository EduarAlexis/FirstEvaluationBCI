package com.nisum.exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    /**
     * Puntaje total: 10 puntos
     */
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("arandanos", "ana", "pepino", "arpegio", "gato", "pepe", "ala");
        System.out.println(stringWithFirstLetterA(stringList));
    }

    /**
     * Método que devuelva una lista de todos los Strings que comienzan con la
     * letra 'a' (minúscula) y tienen exactamente 3 letras.
     * @param stringList lista de palabras
     * @return List lista con strings que inician con letra A y tienen tamaño 3.
     */
    public static List<String> stringWithFirstLetterA(List<String> stringList ) {
        return stringList.stream()
                .filter(x -> x.length() == 3)
                .filter(x -> x.charAt(0) == 'a')
                .collect(Collectors.toList());
    }
}