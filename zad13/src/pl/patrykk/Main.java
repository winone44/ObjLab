package pl.patrykk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("ax^2+bx+c=0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok a:");
        int a = scanner.nextInt();
        System.out.println("Podaj bok b:");
        int b = scanner.nextInt();
        System.out.println("Podaj bok c:");
        int c = scanner.nextInt();
        double x1, x2, delta;


        if (a != 0) {

            delta = Math.pow(b, 2) - 4 * a * c;
            if (delta > 0) {

                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);

                System.out.println("x1: " + wyswietlDwaMiejsca(x1) + ", x2: " + wyswietlDwaMiejsca(x2));

            } else {

                if (delta == 0) {
                    x1 = -b / (2 * a);
                    System.out.println("x: " + wyswietlDwaMiejsca(x1));
                } else {
                    System.out.println("Brak rozwiązania");
                }

            }

        } else {

            if (b != 0) {
                x1 = (-c / b);
                System.out.println("x: " + wyswietlDwaMiejsca(x1));
            } else {

                if (c != 0) {
                    System.out.println("Sprzeczność");
                } else {
                    System.out.println("Zbiór R");
                }

            }

        }


    }


    static double wyswietlDwaMiejsca(double number1) {


        // Zaokrąglenie do 2 miejsca po przecinku:
        number1 *= 100;
        number1 = Math.round(number1);
        number1 /= 100;

        return number1;
    }


}