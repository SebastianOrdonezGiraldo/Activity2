package AreaRectangulo;

import java.util.Scanner;

public class AreaRectanguloMain {
    public static void main(String[] args) {
        AreaRectangulo area = new AreaRectangulo();
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese la base :");
        area.base = lector.nextInt();

        System.out.print("Ingrese la altura :");
        area.altura = lector.nextInt();

        System.out.println("El area es:" + area.calcularArea());
    }
}
