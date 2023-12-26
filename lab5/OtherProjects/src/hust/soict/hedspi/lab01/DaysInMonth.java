package hust.soict.hedspi.lab01;
import java.util.HashMap;
import javax.swing.JOptionPane;
import java.util.Map;
public class DaysInMonth{
    public static void main(String[] args) {
        Map<String, Integer> Months = new HashMap<String, Integer>() {{
          put("January",1); put("Jan.",1);put("Jan",1);put("1",1);
          put("February",2); put("Feb.",2); put("Feb",2);put("2",2);
          put("March",3); put("Mar.",3); put("Mar",3);put("3",3);
          put("April",4); put("Apr.",4); put("Apr",4);put("4",4);
          put("May",5); put("May.",5); put("May",5);put("5",5);
          put("June",6); put("June.",6); put("June",6);put("6",6);
          put("July",7); put("July.",7); put("July",7);put("7",7);
          put("August",8); put("Aug.",8); put("Aug",8);put("8",8);
          put("September",9); put("Sept.",9); put("Sep",9);put("9",9);
          put("October",10); put("Oct.",10); put("Oct",10);put("10",10);
          put("November",11); put("Nov.",11); put("Nov",11);put("11",11);
          put("December",12); put("Dec.",12); put("Dec",12);put("12",12);
        }};
      // Sử dụng map gán các input có thể có của một tháng với số tháng ở dạn int 
     String strNum1, strNum2;
    int[] A = new int[]{ 31,28,31,30,31,30,31,31,30,31,30,31 };
    // Mảng lưu trữ các ngày có trong 1 tháng của năm không nhận
    boolean check;
    check = false;
    // kiểm tra xem user có nhập input hợp lệ
    while (!check) {
        check = false;
        // Nếu check là false thì yêu cầu user input lại
        strNum1 = JOptionPane.showInputDialog(null, "Please input the month", "Input the month", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the year", "Input the year", JOptionPane.INFORMATION_MESSAGE);
        // Nhập input
        if (Months.containsKey(strNum1)) {
            check = true;
            // Nêu input các cách gọi month có trong map thì là hợp lệ và chuyển check thành true
            try {
                int year = Integer.parseInt(strNum2);
                // Sử dụng try để kiểm tra xem year có phải là số
                if (year >= 0) {
                	//nếu year lớn hơn 0 thì thỏa mãn 
                    if ((year % 4 == 0) && (year % 100 != 0)) {
                    	// Kiểm tra có phải năm nhuận không
                        if (Months.get(strNum1) == 2) {
                            System.out.println("In the year " + strNum2);
                            System.out.println("The number of days in the month " + strNum1 + ": " + (A[Months.get(strNum1) - 1] + 1));
                        }
                    } else {
                        System.out.println("In the year " + strNum2);
                        System.out.println("The number of days in the month " + strNum1 + ": " + A[Months.get(strNum1) - 1]);
                    }
                }
            } catch (NumberFormatException e) {
                check = false;
                // Nếu year không phải là số thì check = false
            }
        }
        
        if (!check) {
            JOptionPane.showMessageDialog(null, "Error, please input again", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }
}