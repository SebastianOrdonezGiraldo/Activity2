package Ejercicio17;

import javax.swing.JOptionPane;

public class Ejercicio17Main {
    public static void main(String[] args) {
        Ejercicio17 gym = new Ejercicio17();
        String option = JOptionPane.showInputDialog("Por favor, ingrese la duración de la membresía que desea (15 días, 30 días, 3 meses):");
        int cost = gym.getCost(option);
        if (cost == -1) {
            JOptionPane.showMessageDialog(null, "Opción no válida");
        } else {
            JOptionPane.showMessageDialog(null, "El costo de la mensualidad para " + option + " es " + cost);
        }
    }
}
