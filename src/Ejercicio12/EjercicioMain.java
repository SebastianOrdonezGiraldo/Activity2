package Ejercicio12;


import java.util.Scanner;

public class EjercicioMain {
        public static void main(String[] args) {
            Ejercicio12 ejercicio12 = new Ejercicio12();
            Scanner lector = new Scanner(System.in);
            System.out.print("Enter the type of washer (1 for large, 2 for small):");
            int washerType = lector.nextInt();

            System.out.print("Enter the number of hours:");
            int hours = lector.nextInt();

            System.out.print("Enter the number of washers:");
            int numberOfWashers = lector.nextInt();

            int costPerHour = (washerType == 1) ? ejercicio12.lavadoraGrande : ejercicio12.lavadoraPequeña;
            int totalCost = costPerHour * hours * numberOfWashers;

            if (numberOfWashers > 3) {
                totalCost -= totalCost * ejercicio12.descuento;
            }

            System.out.println("The total cost is: $" + totalCost);

        }
}
