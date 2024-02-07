package Ejercicio18;

import javax.swing.*;

public class Ejercicio18Main {
    public static void main(String[] args) {
        Ejercicio18 ejercicio18 = new Ejercicio18();
        ejercicio18.angle1= Integer.parseInt(JOptionPane.showInputDialog(null,"Insert angle 1:"));
        ejercicio18.angle2= Integer.parseInt(JOptionPane.showInputDialog(null,"Insert angle 1:"));
        ejercicio18.angle3= Integer.parseInt(JOptionPane.showInputDialog(null,"Insert angle 1:"));
        JOptionPane.showMessageDialog(null,"the angle is : " + ejercicio18.calcular());
    }
}
