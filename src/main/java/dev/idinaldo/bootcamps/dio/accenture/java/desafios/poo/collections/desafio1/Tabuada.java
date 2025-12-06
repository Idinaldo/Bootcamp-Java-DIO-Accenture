package dev.idinaldo.bootcamps.dio.accenture.java.desafios.poo.collections.desafio1;

import java.util.List;
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> numbersStr = List.of(scanner.nextLine().split(","));

        tabuadaAdicao(numbersStr);
        tabuadaSubtracao(numbersStr);

    }

    public static void tabuadaAdicao(List<String> numbers) {
        for (String number : numbers) {
            int temp = Integer.valueOf(number);
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d + %d = %d\n", temp, i, temp + i);
            }
        }
    }

    public static void tabuadaSubtracao(List<String> numbers) {
        for (String number : numbers) {
            int temp = Integer.valueOf(number);
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d - %d = %d\n", temp, i, temp - i);
            }
        }
    }
}

