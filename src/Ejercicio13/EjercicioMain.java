package Ejercicio13;

import java.util.Scanner;

public class EjercicioMain {
    public static void main(String[] args) {
        Ejercicio13 ejercicio13 = new Ejercicio13();
        Scanner lector = new Scanner(System.in);
        System.out.print("Insert a number:");
        ejercicio13.number = lector.nextInt();

        if (ejercicio13.number % 2 == 0){
            System.out.println("the number " + ejercicio13.number + " is even.");
        }else {
            System.out.println("The number " + ejercicio13.number + " is odd.");
        }



    }
}

