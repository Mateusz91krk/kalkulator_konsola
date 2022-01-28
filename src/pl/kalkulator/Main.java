package pl.kalkulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Prosty kalkulator w konsoli.");

        System.out.println("Podaj pierwszą liczbę:");
        //Scanner scanner = new Scanner(System.in);
        //scanner.nextLong <- CTRL+ALT+V
        Scanner scanner = new Scanner(System.in);
        long liczba = scanner.nextLong();
        System.out.println("Podaj drugą liczbę:");
        Scanner scanner1 = new Scanner(System.in);
        long liczba1 = scanner1.nextLong();
        System.out.println("Twoje liczby to:\n" + liczba + " i " + liczba1);
        System.out.println("Podstawowe działania na Twoich liczbach:");

        System.out.println("Dodawanie:\n" + liczba + " + " + liczba1 + " = " + (liczba+liczba1));
        System.out.println("Odejmowanie:\n" + liczba + " - " + liczba1 + " = " + (liczba-liczba1));
        System.out.println("lub\n" + liczba1 + " - " + liczba + " = " + (liczba1-liczba));
        System.out.println("Mnożenie:\n" + liczba + " * " + liczba1 + " = " + (liczba*liczba1));
        System.out.println("Dzielenie:\n" + liczba + " / " + liczba1 + " = " + (liczba/liczba1));
        System.out.println("lub\n" + liczba1 + " / " + liczba + " = " + (liczba1/liczba));

        System.out.println("Podaj dwie liczby:");
        Scanner scanner2 = new Scanner(System.in);
        double liczba2 = scanner2.nextDouble();
        Scanner scanner3 = new Scanner(System.in);
        double liczba3 = scanner3.nextDouble();

        System.out.println("Dzielenie:\n" + liczba2 + " / " + liczba3 + " = " + (liczba2/liczba3));
        System.out.println("lub\n" + liczba3 + " / " + liczba2 + " = " + (liczba3/liczba2));
    }
}
