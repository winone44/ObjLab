package pl.patrykk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów:");
        int number2 = scanner.nextInt();
        if (number2 > 0) {
            double tablica[] = new double[number2];
            double suma = 0;
            System.out.println("\nPodaj liczbę/liczby:");
            for (int i = 0; i < tablica.length; i++) {
                tablica[i] = scanner.nextInt();
            }
            for (int i = 0; i < tablica.length; i++) {
                suma = suma + tablica[i];
            }

            System.out.println("średnia: " + (suma / number2));
        } else {
            System.out.println("Błąd");
        }

    }
}
