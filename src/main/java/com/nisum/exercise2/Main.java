package com.nisum.exercise2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    /**
     * Puntaje total: 10 puntos
     */
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("juan", "manzana", "paralelepipedo", "pedro", "piña", "senior developer", "amargado");
        List<Integer> integerList = Arrays.asList(56, 61, 8, 21, 50, 30, 110, 784, 88);

        System.out.println(upperCaseList(stringList));
        System.out.println(averageList(integerList));
    }

    /**
     * Método que reciba como parámetro una lista de Strings y retorne la misma lista, pero esta vez en UpperCase (usando Lambdas).
     * @param stringList lista de cadenas
     * @return List lista con datos en upperCase.
     */
    public static List<String> upperCaseList(List<String> stringList) {
        return stringList.stream().map(word -> word.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
    }

    /**
     * Método que retorna el promedio de una lista de enteros (usando Lambdas)..
     * @param integerList lista de numeros
     * @return Double promedio de la lista de enteros.
     */
    public static Double averageList(List<Integer> integerList) {
        return integerList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(Double.NaN);
    }
}