package pl.patrykk;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres do:");
        int number = scanner.nextInt();
        System.out.println("Podaj liczbę elementów:");
        int number2 = scanner.nextInt();
        int tablica[] = new int[number2];

        for (int i = 0; i < tablica.length; i++){
            tablica[i] = random.nextInt(number);
        }
        for (int i = 0; i < tablica.length; i++){
            System.out.println(tablica[i]);
        }

    }
}
