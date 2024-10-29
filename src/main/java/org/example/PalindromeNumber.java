package org.example;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        int n = 11;
        boolean resultado = p.isPalindrome(n);
        System.out.println(resultado);
    }

    public boolean isPalindrome(int parteInteira) {
        int valorOriginal = parteInteira;
        ArrayList<Integer> numeros = new ArrayList<>();
        while (parteInteira > 10) {
            float result = (float) parteInteira / 10;
            parteInteira = (int) result;
            int parteDecimal = (int) ((result - parteInteira) * 10);
            numeros.add(parteDecimal);
        }
        numeros.add(parteInteira);
        String num = numeros.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        if (valorOriginal <= 10) {
            return false;
        }else if (valorOriginal == Integer.parseInt(num)){
            return true;
        }
        return false;
    }
}
