// package lab1;

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");

        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen: YES");
        } else if (option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen: NO");
        } else if (option == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen: CANCEL");
        } else if (option == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "You've closed the dialog");
        }

        System.exit(0);
    }
}
