package hust.soict.hedspi.swing;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame {
   private TextField tfInput; 
   private TextField tfOutput;
   private int sum = 0; // tổng để là 0
   
   // Constructor để setup các thành phần GUI và events handler
   public AWTAccumulator() {
      setLayout(new GridLayout(2, 2));

      add(new Label("Enter an Integer: "));

      tfInput = new TextField(10);
      add(tfInput); 
      tfInput.addActionListener(new TFInputListener());
      
      add(new Label("The Accumulated Sum is: "));

      tfOutput = new TextField(10);
      tfOutput.setEditable(false);
      add(tfOutput);

      setTitle("AWT Accumulator");
      setSize(350, 120);
      setVisible(true);
}

   public static void main(String[] args) {
	   new AWTAccumulator();
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