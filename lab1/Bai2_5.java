// package lab1;

import javax.swing.*;

public class Bai2_5 {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, "Please enter the first number:",
                "Enter the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please enter the second number:",
                "Enter the second number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null, "sum:" + (num1 + num2) + "\n"
                + "difference: " + (num1 - num2) + "\n"
                + "product: " + num1 * num2 + "\n"
                + "quotient: " + num1 / num2);
        System.exit(0);
    }
}