package Ejercicio11;

import java.util.Scanner;

public class Ejerciciomain {
    public static void main(String[] args) {
        Ejercicio11 ejercicio11 = new Ejercicio11();
        Scanner lector = new Scanner(System.in);
        System.out.println("Enter a number:");
        ejercicio11.number1 = lector.nextInt();
        System.out.println("The number entered is " + ejercicio11.number2());
    }


}
