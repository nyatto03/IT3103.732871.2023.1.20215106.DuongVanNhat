package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main (String[] arg)
    {
        String strNum1, strNum2;
        //Khai báo biến
        String strNotification = "You've just entered: ";
        //String kết quả
        strNum1 = JOptionPane.showInputDialog(null,"Please input the first number:",
        "Input the first number",JOptionPane.INFORMATION_MESSAGE);
        //Lấy số thứ nhất 
        strNotification = strNotification + strNum1 + " and ";
        //Ghép vào string kết quả
        strNum2 = JOptionPane.showInputDialog(null,"Please input the second number:",
        "Input the second number",JOptionPane.INFORMATION_MESSAGE);
        //Lấy sô thứ hai
        strNotification += strNum2;
        //Ghép vào string kết quả
         JOptionPane.showMessageDialog(null,strNotification,"Show two numbers",
         JOptionPane.INFORMATION_MESSAGE);
        //In string kết quả
         System.exit(0);
    }
}