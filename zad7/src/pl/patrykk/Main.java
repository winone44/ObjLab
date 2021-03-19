package pl.patrykk;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów:");
        int number2 = scanner.nextInt();
        if (number2 > 0) {
            double tablica[] = new double[number2];

            System.out.println("\nPodaj liczbę/liczby:");
            for (int i = 0; i < tablica.length; i++) {
                tablica[i] = scanner.nextInt();
            }

            Arrays. sort(tablica);
            System.out.println("Minimum: " + tablica[0]);
            if (number2 % 2 == 0){

                System.out.println("Wartość środkowa(średnia): " + (((tablica[(number2 / 2) + 1])+tablica[number2 / 2]) / 2));

            }else {

                System.out.println("Wartość środkowa: " + tablica[(number2 / 2) + 1]);
            }
            System.out.println("Maximum: " + tablica[tablica.length-1]);

        } else {
            System.out.println("Błąd");
        }

    }
}
