package Ejercicio15;

import javax.swing.*;




    public class Ejercicio15Main {
        public static void main(String[] args) {
            Ejercicio15 ejercicio15 = new Ejercicio15();
            ejercicio15.n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a random number:"));
            ejercicio15.n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a random number:"));
            ejercicio15.n3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a random number:"));
            JOptionPane.showMessageDialog(null, "the largest number is: " + ejercicio15.calculate());
        }
    }

