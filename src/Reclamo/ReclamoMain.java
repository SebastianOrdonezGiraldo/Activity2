package Reclamo;

import java.util.Random;
import javax.swing.JOptionPane;

public class ReclamoMain {
    public static void main(String[] args) {
        Reclamo reclamo = new Reclamo();
        Random random = new Random();

        reclamo.personName = JOptionPane.showInputDialog("Enter the person's name: ");
        reclamo.subject = JOptionPane.showInputDialog("Enter the subject of the claim: ");
        reclamo.description = JOptionPane.showInputDialog("Enter the description of the claim: ");

        int randomNumber = random.nextInt(101);

        JOptionPane.showMessageDialog(null, "Your claim has been successful with the name: " + reclamo.personName + " with the subject: " + reclamo.subject + " with the claim number: " + randomNumber);
    }
}

