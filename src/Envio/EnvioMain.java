package Envio;


import java.util.Scanner;

public class EnvioMain {


    public static void main(String[] args) {
        Envio envio = new Envio();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el peso del paquete:");
        envio.peso = lector.nextInt();

        System.out.println("el costo de su envio es:" + "$" +envio.calcularCosto());
    }
}
