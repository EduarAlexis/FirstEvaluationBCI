package com.nisum.exercise6.utils;

import com.nisum.exercise6.interfaces.PerformOperation;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return (a -> a % 2 ==0 ? false: true);
    }

    public PerformOperation isPrime() {
        return numero -> {
            if (numero <= 1) return false;
            int contador = 0;
            for (int i = (int) Math.sqrt(numero); i > 1; i--) {
                if (numero % i == 0) contador++;
            }
            return contador < 1;
        };
    }

    public PerformOperation isPalindrome() {
        return str -> {
            return String.valueOf (str).equals(new StringBuilder(String.valueOf(str)).reverse().toString());
        };
    }
}