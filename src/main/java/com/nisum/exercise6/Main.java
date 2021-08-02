package com.nisum.exercise6;

import com.nisum.exercise6.interfaces.PerformOperation;
import com.nisum.exercise6.utils.MyMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    /**
     *
     * Escriba los siguientes métodos que retornen una expresión lambda que desarrolle la acción específica:
     *
     * Desarrolle la función isOdd(): Esta expresión lambda debería retornar True si el número es impar y False si el número no lo es.
     * Desarrolle la función isPrime(): Esta expresión lambda debería retornar True si el número es primo y False si el número no lo es.
     * Desarrolle la función isPalindrome(): Esta expresión lambda debería retornar True si el número es palindrome y False si el número no lo es.
     *
     * Puntaje total: 20 puntos
     */
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;

        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
            }

            System.out.println(ans);
        }
    }
}