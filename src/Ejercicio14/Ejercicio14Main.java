package Ejercicio14;

import javax.swing.*;

public class Ejercicio14Main {
    public static void main(String[] args) {
        double physicsGrade = Double.parseDouble(JOptionPane.showInputDialog("Enter Physics grade:"));
        double chemistryGrade = Double.parseDouble(JOptionPane.showInputDialog("Enter Chemistry grade:"));
        double biologyGrade = Double.parseDouble(JOptionPane.showInputDialog("Enter Biology grade:"));
        double mathGrade = Double.parseDouble(JOptionPane.showInputDialog("Enter Math grade:"));
        double computerScienceGrade = Double.parseDouble(JOptionPane.showInputDialog("Enter Computer Science grade:"));

        Ejercicio14 student = new Ejercicio14(physicsGrade, chemistryGrade, biologyGrade, mathGrade, computerScienceGrade);
        double average = student.calculateAverage();
        String grade = student.getGrade();

        JOptionPane.showMessageDialog(null, "The average is: " + average);
        JOptionPane.showMessageDialog(null, "The grade is: " + grade);
    }
    }


