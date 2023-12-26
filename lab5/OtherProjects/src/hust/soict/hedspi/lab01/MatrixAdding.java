package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class MatrixAdding {
    public static void main(String[] arg)
    { Scanner scanner = new Scanner(System.in);
      int n,m;
      n = Integer.parseInt(JOptionPane.showInputDialog
      (null,"Please enter the number of rows",
      "Input n",JOptionPane.INFORMATION_MESSAGE));
      m = Integer.parseInt(JOptionPane.showInputDialog
      (null,"Please enter the number of coulumns",
      "Input m",JOptionPane.INFORMATION_MESSAGE));
      // Nhập số hàng và số cột của ma trận 
     int[][] A = new int[n][m];
     int[][] B = new int[n][m];
     int[][] C = new int[n][m];
      System.out.println("Please enter the values of matrix A");
      for (int i = 0; i < n; i++)
        {for (int k = 0; k < m; k++)
           {
            System.out.println("A" + "[" + i +"]" + "[" + k +"]");
            A[i][k] = scanner.nextInt();
           }
        }
      // Nhập các số vào ma trận
      System.out.println("Please enter the values of matrix B");
      for (int i = 0; i < n; i++)
        {
            for (int k = 0; k < m; k++)
               {
                System.out.println("B" + "[" + i +"]" + "[" + k +"]");
                B[i][k] = scanner.nextInt();
                C[i][k] = A[i][k] + B[i][k];
                // Cộng và ghi kết quả tại hàng và cột tương ứng vào ma trận C
               }
        }
       System.out.println("The result is");
       for (int i = 0; i < n; i++)
        {
            for (int k = 0; k < m; k++)
               {
                System.out.print(C[i][k] + " ");
               }
            System.out.print("\n");  
        }
        // In ma trận C
    }
}