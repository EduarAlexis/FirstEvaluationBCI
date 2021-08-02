package com.nisum.exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    /**
     * Puntaje total: 10 puntos
     */
    public static void main(String[] args) {
        List<Integer> stringList = Arrays.asList(21, 730, 840, 221, 14, 13, 729, 1053, 459);
        System.out.println(stringEvenAndOdd((stringList)));
    }

    /**
     * Método que devuelva una String separado por comas en función de una lista determinada de
     * números enteros. Cada elemento debe estar precedido por la letra 'e' si el número es par, y precedido
     * por la letra 'o' si el número es impar. Por ejemplo, si la lista de entrada es (3,44),
     * la salida debería ser 'o3, e44'
     * @param stringList lista de numeros
     * @return String cadena según formato solicitado.
     */
    public static String stringEvenAndOdd(List<Integer> stringList) {
        return stringList.stream()
                .map(x-> x % 2 == 0 ? "e"+x: "o"+x)
                .collect(Collectors.toList())
                .toString()
                .replace("[", "'")
                .replace("]","'");
    }
}