package AreaRectangulo;

import java.util.Scanner;

public class AreaRectanguloMain {
    public static void main(String[] args) {
        AreaRectangulo area = new AreaRectangulo();
        Scanner lector = new Scanner(System.in);

        System.out.print("Enter the base:");
        area.base = lector.nextInt();

        System.out.print("Enter the height :");
        area.height = lector.nextInt();

        System.out.println("The area is:" + area.calcularArea());
    }
}
