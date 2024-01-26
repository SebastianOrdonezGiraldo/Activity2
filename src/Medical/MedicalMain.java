package Medical;

import java.util.Scanner;





public class MedicalMain {
    //Metodo
    public static void main(String[] args) {
        Medical schedule = new Medical();
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese nombre del paciente:");
        schedule.userName = lector.next();
        System.out.println("Ingrese hora deseada:");
        schedule.hour = lector.nextFloat();
        System.out.println("Ingrese fecha deseada formato 00/00/00:");
        schedule.date = lector.next();
        System.out.println("Cita agendada correctamente");
        System.out.println("A nombre de:" + schedule.userName);
        System.out.println("hora:" + schedule.hour);
        System.out.println("fecha:" + schedule.date);
    }
}
