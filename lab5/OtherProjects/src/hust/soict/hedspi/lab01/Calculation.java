package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;
public class Calculation{
    public static void main(String[] arg)
    {  String strNum1, strNum2;
       strNum1 = JOptionPane.showInputDialog(null,"Please input the first number:",
       "Input the first number",JOptionPane.INFORMATION_MESSAGE);
       strNum2 = JOptionPane.showInputDialog(null,"Please input the second number:",
      "Input the second number",JOptionPane.INFORMATION_MESSAGE);
       double num1 = Double.parseDouble(strNum1);
       double num2 = Double.parseDouble(strNum2);
       // Lấy hai số từ người dùng và chuyển từ dạng string dang double
       double sum, different, product, quotient;
       sum = num1 + num2;
       different = num1 - num2;
       product = num1 * num2;
       // Thực hiện các phép tính +, -, *
       System.out.println("sum = " + sum);
       System.out.println("different = " + different);
       System.out.println("product = " + product);
       // In kết quả +, -, *
       if (num2 == 0) {
       // Kiểm tra xem số thứ 2 có bằng 0
        System.out.println("Can't divide by 0");
       }
         else
         {
            quotient = num1 / num2;
            System.out.println("quotient = " + quotient);
         // Nếu số thứ 2 khác 0 in kết quả chia
         }
    }
}