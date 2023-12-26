package hust.soict.hedspi.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingAccumulator extends JFrame {
    private JTextField tfInput;
    private JTextField tfOutput; private int sum = 0;
 // tổng để là 0
    
    // Constructor để setup các thành phần GUI và events handler
    public SwingAccumulator() {
         Container cp = getContentPane();
         cp.setLayout(new GridLayout(2, 2));
         
         cp.add(new JLabel("Enter an Integer: "));
         
         tfInput = new JTextField(10);
         cp.add(tfInput); tfInput.addActionListener(new TFInputListener());
         cp.add(new JLabel("The Accumulated Sum is: "));
         
         tfOutput = new JTextField(10);
         tfOutput.setEditable(false);
         cp.add(tfOutput);
         
         setTitle("Swing Accumulator");
         setSize(350, 120);
         setVisible(true);
}
    public static void main(String[] args) {
    new SwingAccumulator();
}
    private class TFInputListener implements ActionListener { 
    	@Override
    public void actionPerformed(ActionEvent evt) {
       int numberIn = Integer.parseInt(tfInput.getText());
       sum += numberIn;
       tfInput.setText("");
       tfOutput.setText(sum + "");
     //ActionListener, khi nhập một số mới vào thì cộng vào tổng
      }
    }
}