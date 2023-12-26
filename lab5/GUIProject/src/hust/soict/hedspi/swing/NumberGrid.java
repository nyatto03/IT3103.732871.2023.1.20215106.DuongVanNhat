package hust.soict.hedspi.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NumberGrid extends JFrame{
    private JButton [] btnNumbers = new JButton [10];
    private JButton btnDelete, btnReset;
    private JTextField tfDisplay;

    public NumberGrid() {
         //Khởi tạo gui
    	tfDisplay = new JTextField();
        tfDisplay.setComponentOrientation(
        		ComponentOrientation.RIGHT_TO_LEFT);

        JPanel panelButtons = new JPanel(new GridLayout(4, 3)); 
        addButtons(panelButtons);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay, BorderLayout.NORTH); 
        cp.add(panelButtons, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setTitle("Number Grid"); 
        setSize(200, 200); 
        setVisible(true);
     }
    
    void addButtons (JPanel panelButtons) {
    	ButtonListener btnListener = new ButtonListener();
    	for(int i = 1; i <= 9; i++) {
    	    btnNumbers[i] = new JButton(""+i); 
    	    panelButtons.add(btnNumbers[i]);
    	    btnNumbers[i].addActionListener(btnListener);
    	}
    	//Thêm các số từ 1 đến 0 
    	btnDelete = new JButton("DEL");
    	panelButtons.add(btnDelete);
    	btnDelete.addActionListener(btnListener);
    	//Thêm Del
    	btnNumbers [0] = new JButton("0");
    	panelButtons.add(btnNumbers[0]);
    	//Thêm số 0
    	btnNumbers[0].addActionListener(btnListener);
    	
    	btnReset = new JButton("C");
    	panelButtons.add(btnReset);
    	btnReset.addActionListener(btnListener);
    	//Thêm C để clear
    	}
    
    private class ButtonListener implements ActionListener{ 
    	@Override
    	public void actionPerformed(ActionEvent e) {
    	    String button = e.getActionCommand();
    	    if(button.charAt(0) >= '0' && button.charAt(0) <= '9') { 
    	    	tfDisplay.setText(tfDisplay.getText() + button);
    	    }// Nếu chọn là 0 đến ( thì gắn bào string
    	    else if (button.equals("DEL")) {
    	    	tfDisplay.setText(tfDisplay.getText().substring(0, tfDisplay.getText().length() - 1));
    	    	//Nếu là del thì bỏ ký tự cuối
    	}
    	else {//Không là C thì chuyển thành xâu rỗng
    		tfDisplay.setText("");
    	}
      }
    }
    
    public static void main(String[] args) {
 	   new NumberGrid();
    }
}