package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;
public class PrintingStars {
    public static void main(String[] arg)
    { int n;
      n = Integer.parseInt(JOptionPane.showInputDialog
      (null,"Please enter the height of the pyramid",
      "Input n",JOptionPane.INFORMATION_MESSAGE));
      // lấy chiều cao của kim tự tháp
      for (int i = 0; i < n; i++)
        { for (int k = 0; k < n-i; k++)
              {
                System.out.print(" ");
                // In ra khoảng trống tương ứng để đặt sao vào vị trí đúng
              }
          for (int k = 0; k < 1 + i*2; k++)
              {
                System.out.print("*");
                // In số sao tại tầng k
              }
          System.out.print("\n");

        }
        System.exit(0);
    }
}