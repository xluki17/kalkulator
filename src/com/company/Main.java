package com.company;


import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("MENU:\n" +
                "1.Suma\n" +
                "2.Różnica\n" +
                "3.Iloczyn\n" +
                "4.Iloraz\n" +
                "5.Modulo\n");

        int liczba;
        Scanner licz = new Scanner(System.in);
        liczba = licz.nextInt();

        switch (liczba) {
            case 1:
                System.out.println("Suma\n");
                double a, b;
                System.out.print("podaj pierwszą liczbę: ");
                a = licz.nextInt();
                System.out.print("podaj drugą liczbę: ");
                b = licz.nextInt();
                double suma;
                suma = a + b;

                System.out.println("Suma= " + suma);
                break;
            case 2:
                System.out.println("Różnica");

                System.out.print("podaj pierwszą liczbę: ");
                a = licz.nextInt();
                System.out.print("podaj drugą liczbę: ");
                b = licz.nextInt();
                double roznica;
                roznica = a - b;

                System.out.println("Różnica= " + roznica);
                break;
            case 3:
                System.out.println("Iloczyn");
                System.out.print("podaj pierwszą liczbę: ");
                a = licz.nextInt();
                System.out.print("podaj drugą liczbę: ");
                b = licz.nextInt();
                double iloczyn;
                iloczyn = a * b;

                System.out.println("Iloczy= " + iloczyn);
                break;
            case 4:
                System.out.println("Iloraz");
                System.out.print("podaj pierwszą liczbę: ");
                a = licz.nextInt();
                System.out.print("podaj drugą liczbę: ");
                b = licz.nextInt();
                double iloraz;
                iloraz = a / b;

                System.out.println("Iloraz= " + iloraz);
                break;
            case 5:
                System.out.println("Modulo");
                System.out.print("podaj pierwszą liczbę: ");
                a = licz.nextInt();
                System.out.print("podaj drugą liczbę: ");
                b = licz.nextInt();
                double modulo;
                modulo = a % b;

                System.out.println("Modulo= " + modulo);
                break;
        }

    }
}