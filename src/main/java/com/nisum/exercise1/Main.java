package com.nisum.exercise1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    /**
     * Escriba una función lambda que permita:
     *
     * 1.- Calcular los cuadrados de los números en la lista.
     * 2.- Obtener los números pares en la lista de cuadrados.
     *
     * Puntaje total: 10 puntos
     */
    public static void main(String[] args) {
        //Logger logger = Logger.getLogger(Main.class.getName());
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        alCuadradoYListPares(numbers);
        System.out.println();
        System.out.println("\t"+alCuadradoYListaPares(numbers));
    }

    /**
     * Forma 1: Se desarrollan los dos puntos y se muestran por pantalla. En esta forma se utiliza una expresión lambda
     * haciendo us de una interfaz funcional.
     * */
    public static void alCuadradoYListPares(List<Integer> numbers) {
        AlCuadrado cuadrado = (a,b) -> a*b;
        numbers.stream()
                .map(number -> cuadrado.cuadrado(number, number))
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.print("\t"+number));
    }

    /**
     * Forma2: Se calculan los cuadrados de cada número y luego se filtran solo los números pares, por último
     * guardamos los números pares en una lista y la mostramos por pantalla.
     * */
    public static List<Integer> alCuadradoYListaPares(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * number)
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }
}