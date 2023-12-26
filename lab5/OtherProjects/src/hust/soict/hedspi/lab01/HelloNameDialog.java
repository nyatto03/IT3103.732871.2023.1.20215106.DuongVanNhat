package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;
public class HelloNameDialog{
    public static void main(String[] arg)
    {
        String result;
        result = JOptionPane.showInputDialog("Please enter your name:");
        //Lấy tên mà người dùng điền vào hộp thoại
        JOptionPane.showMessageDialog(null,"Hi " + result + "!");
        //In tên đã điền ra hộp thoại
    }
}
