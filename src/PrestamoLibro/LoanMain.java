package PrestamoLibro;

import javax.swing.*;

public class LoanMain {
    public static void main(String[] args) {
        loan prestamo = new loan();
        // Set the loan details
        prestamo.setLoanCode("123");
        prestamo.setLoanDate("05/02/2024");
        prestamo.setLoanStatus("Active");

        // Prompt the user to enter the book name and user code
        prestamo.setBookName(JOptionPane.showInputDialog(null,"Enter the book name: "));
        prestamo.setUserCode(JOptionPane.showInputDialog(null,"Enter your user code: "));

        // Set the loan duration
        prestamo.setLoanDays(5);

        // Display a message showing the loan details
        JOptionPane.showMessageDialog(null,"Your loan was registered under the name: " + prestamo.getUserCode() + " for: " + prestamo.getLoanDays() + " days");

        int selection;
        do {
            // Options for the user to choose from
            String[] options = {"Check loan details", "Check loan status", "Exit"};

            // Display a dialog box with the options
            selection = JOptionPane.showOptionDialog(null, "What would you like to do?", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            // Perform an action based on the user's selection
            if(selection == 0){
                JOptionPane.showMessageDialog(null,prestamo.checkData());
            } else if (selection == 1) {
                JOptionPane.showMessageDialog(null,prestamo.checkLoanStatus());
            }
        } while (selection != 2); // The menu will be displayed until the user selects "Exit"
    }
}
