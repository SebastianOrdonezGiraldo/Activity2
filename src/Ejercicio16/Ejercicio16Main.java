package Ejercicio16;

import javax.swing.*;

public class Ejercicio16Main {


    public static void main(String[] args) {
            String gender = (JOptionPane.showInputDialog("Please, enter your gender:"));
            int age = Integer.parseInt(JOptionPane.showInputDialog("Please, enter your age:"));

            Ejercicio16 ejercicio16 = new Ejercicio16(gender, age);
            int aid = ejercicio16.calculateAid();

            JOptionPane.showMessageDialog(null, "The calculated aid is: " + aid);
        }
    }

