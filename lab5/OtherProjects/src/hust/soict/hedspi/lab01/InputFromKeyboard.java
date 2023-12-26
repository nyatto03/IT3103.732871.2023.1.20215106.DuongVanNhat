package hust.soict.hedspi.lab01;
import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        // Tạo scanner
        System.out.println("What's your name?");
        String strName = keyboard.nextLine();
        // Lấy tên
        System.out.println("How old are you?");
        int iAge = keyboard.nextInt();
        // Lấy tuổi
        System.out.println("How  tall are you (m)?");
        double dHeight = keyboard.nextDouble();
        // Lấy chiều cao (m)
        System.out.println("Mrs/Ms. " + strName + ", " + iAge + "years old. "
                           +"Your height is " + dHeight + ".");
        // In kết quả ra terminal
    }
   
}