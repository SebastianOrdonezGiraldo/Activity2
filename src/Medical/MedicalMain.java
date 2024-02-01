package Medical;




import javax.swing.*;

public class MedicalMain {
    private static Medical schedule = new Medical();

    public static void main(String[] args) {
        while (true) {
            Object[] options = {"Agendar cita", "Cambiar la hora de la cita", "Salir"};
            int n = JOptionPane.showOptionDialog(null,
                    "Bienvenido al sistema de citas medicas",
                    "Sistema de Citas Medicas",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[2]);

            switch (n) {
                case 0:
                    schedule.userName = JOptionPane.showInputDialog("Nombre del paciente:");
                    schedule.hour = JOptionPane.showInputDialog("Ingrese hora deseada:");
                    schedule.date = JOptionPane.showInputDialog("Ingrese fecha deseada formato 00/00/00:");
                    JOptionPane.showMessageDialog(null, "Cita agendada correctamente\n" +
                            "A nombre de: " + schedule.userName + "\n" +
                            "hora: " + schedule.hour + "\n" +
                            "fecha: " + schedule.date);
                    break;
                case 1:
                    String nuevoValor = JOptionPane.showInputDialog("Ingrese la hora deseada : ");
                    schedule.hour = nuevoValor;
                    JOptionPane.showMessageDialog(null, "La nueva hora es: " + schedule.hour);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema de citas medicas");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}


