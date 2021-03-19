package pl.patrykk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("KALKULATOR\n");
        System.out.println("Podaj liczbę:");
        double liczba1 = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Podaj znak +, -, *, /:");
        String symbol = scanner.nextLine();

        System.out.println("Podaj liczbę:");
        double liczba2 = scanner.nextDouble();

        if (liczba2 == 0 && symbol.equals("/")) {

            System.out.println("Nie dziel przez ZERO");

        } else {

            switch (symbol) {
                case "+":
                    System.out.println("Wynik: " + (liczba1 + liczba2));
                    break;
                case "-":
                    System.out.println("Wynik: " + (liczba1 - liczba2));
                    break;
                case "*":
                    System.out.println("Wynik: " + (liczba1 * liczba2));
                    break;
                case "/":
                    System.out.println("Wynik: " + (liczba1 / liczba2));
                    break;

                default:
                    System.out.println("Błąd");
            }

        }








    }
}
