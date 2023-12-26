package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;
import java.lang.Math;
public class Solve{
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null,
                "Please choose which you would like to solve:\n" +
                "1. The first-degree equation (linear equation) with one variable\n" +
                "2. The system of first-degree equations (linear system) with two variables\n" +
                "3. The first-degree equation (linear equation) with one variable",
                "Options", JOptionPane.INFORMATION_MESSAGE);
        // Chọn bài toán sẽ giải trong 3 bài toán đã cho
        if (str.equals("1")) {
            FirstDegreeEquation();
        // Nếu người dùng chọn 1 giải phương trình tuyến tính bậc nhất
        } else if (str.equals("2")) {
            LinearSystem();
        // Nếu người dùng chọn 2 giải hệ phương trình tuyến tính
        } else if (str.equals("3")) {
            SecondDegreeEquation();
        // Nếu người dùng chọn 3 giải phương trình bậc 2
        } else {
            System.out.println("Invalid input (Choose from 1, 2, 3)");
        // Input ngoài 1,2,3 không hợp lệ
        }
        System.exit(0);
    }
    public static void FirstDegreeEquation()
    // Method giải phương trình tuyến tính
    {  String strNum1, strNum2;
       strNum1 = JOptionPane.showInputDialog(null,"Please input a",
       "ax + b = 0",JOptionPane.INFORMATION_MESSAGE);
       strNum2 = JOptionPane.showInputDialog(null,"Please input b",
       "ax + b = 0",JOptionPane.INFORMATION_MESSAGE);
       double a = Double.parseDouble(strNum1);
       double b = Double.parseDouble(strNum2);
       // Lấy các hệ số và chuyển từ string sang double
       if ( a == 0)
       {
          if (b == 0)
          {
            System.out.println("There are infinite solutions to the equation");
            // Kiểm tra nếu a và b cùng = 0
            //0 + 0 = 0 luôn đúng nên hệ có vô số nghiệm
          }
          else
          {
            System.out.println("There are no solutions to the equation");
            // Kiểm tra nếu a =0 mà b khác 0
            // Khi đó 0 + b = 0 vô nghiệm 
          }
       }
       else
       {  
            System.out.println("The answer is" + -b/a);
            // Nếu a khác 0 thực hiện chuyển vế và chia ta có nghiệm
       }
    }

     public static void LinearSystem()
     // Method giải hệ tuyến tính
      {
        double[][] A = new double[2][2];
        double[] B = new double[2];

        String strNum1, strNum2, strNum3, strNum4, strNum5, strNum6;
        strNum1 = JOptionPane.showInputDialog(null, "Please input a11", "a11*x + a12*y = b1", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input a12", "a11*x + a12*y = b1", JOptionPane.INFORMATION_MESSAGE);
        strNum3 = JOptionPane.showInputDialog(null, "Please input b1", "a11*x + a12*y = b1", JOptionPane.INFORMATION_MESSAGE);
        strNum4 = JOptionPane.showInputDialog(null, "Please input a21", "a21*x + a22*y = b2", JOptionPane.INFORMATION_MESSAGE);
        strNum5 = JOptionPane.showInputDialog(null, "Please input a22", "a21*x + a22*y = b2", JOptionPane.INFORMATION_MESSAGE);
        strNum6 = JOptionPane.showInputDialog(null, "Please input b2", "a21*x + a22*y = b2", JOptionPane.INFORMATION_MESSAGE);
        // Lây các hệ số
        A[0][0] = Double.parseDouble(strNum1);
        A[0][1] = Double.parseDouble(strNum2);
        B[0] = Double.parseDouble(strNum3);
        A[1][0] = Double.parseDouble(strNum4);
        A[1][1] = Double.parseDouble(strNum5);
        B[1] = Double.parseDouble(strNum6);
        // Chuyển các hệ số từ string thành double
        double detA = A[0][0] * A[1][1] - A[0][1] * A[1][0];
        // Tính det
        if (detA == 0) {
            if ((A[0][0] * B[1] - A[1][0] * B[0]) == 0 && (A[0][1] * B[1] - A[1][1] * B[0]) == 0) {
                //Kiểm tra xem hai phương tình có phụ thuộc tuyến tính
                System.out.println("There are infinite solutions to the system of equations");
                // Nếu có hệ có vô số nghiệm
            } else {
                System.out.println("There are no solutions to the system of equations");
                // Nếu không hệ vô nghiệm
            }
        } else {
          // Nếu det khác 0 sử dụng công thức để tính ra nghiệm
            double x = (B[0] * A[1][1] - B[1] * A[0][1]) / detA;
            double y = (A[0][0] * B[1] - A[1][0] * B[0]) / detA;
            System.out.println("The solutions to the system of equations are:");
            System.out.println("x: " + x);
            System.out.println("y: " + y);
          // In đáp án
        }
    }

    public static void SecondDegreeEquation()
    // Method giải phương trình bậc 2
    {  String strNum1, strNum2, strNum3;
       strNum1 = JOptionPane.showInputDialog(null,"Please input a",
       "ax^2 + bx + c  = 0",JOptionPane.INFORMATION_MESSAGE);
       strNum2 = JOptionPane.showInputDialog(null,"Please input b",
       "ax^2 + bx + c  = 0",JOptionPane.INFORMATION_MESSAGE);
       strNum3 = JOptionPane.showInputDialog(null,"Please input c",
       "ax^2 + bx + c  = 0",JOptionPane.INFORMATION_MESSAGE);
       double a = Double.parseDouble(strNum1);
       double b = Double.parseDouble(strNum2);
       double c = Double.parseDouble(strNum3);
       // Lấy các hệ số và chuyển từ string sang double
       double delta;
       if (a == 0)
       { // Xét trường hợp a == 0; giải giống phương trình tuyến tính
       if ( b == 0)
       {
          if (c == 0)
          {
            System.out.println("There are infinite soltutions to the equation");
          }
          else
          {
            System.out.println("There are no soltutions to the equation");
          }
       }
       else
       {  
            System.out.println("The answer is" + -c/b);
       }
       }
       else
       {
         delta = b*b -4*a*c;
         // Khi a khác 0 tính delta
         if (delta < 0)
          {
            System.out.println("There are no solutions to the equation");
          }
         if (delta == 0)
         {
            System.out.println("There is 1 solution to the equation");
            System.out.println("The answer is: " + (-b / (2 * a)));
         }
            if (delta > 0)
         {    
              System.out.println("There are 2 solutions to the equation");
              double root1 = (-b - Math.sqrt(delta)) / (2 * a);
              double root2 = (-b + Math.sqrt(delta)) / (2 * a);
              System.out.println("The answers are: " + root1 + " and " + root2);
            // Xét các trường hợp của delta và giải theo công thức
         }
       }
    }

}