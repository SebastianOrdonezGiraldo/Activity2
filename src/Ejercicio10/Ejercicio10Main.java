package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10Main {
    public static void main(String[] args) {
        Ejercicio10 exercise10 = new Ejercicio10();
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your name:");
        exercise10.name = reader.next();
        System.out.print("Enter your worked hours:");
        exercise10.hoursAmount = reader.nextInt();

        System.out.println("Mr. " + exercise10.name + ", the number of hours worked were " + exercise10.hoursAmount + " your salary is: $" + exercise10.hours());
    }
}

