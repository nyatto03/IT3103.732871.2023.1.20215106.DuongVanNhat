package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null,
				"Do you want to change to the first class ticket?");
		//Tạo ra hộp thoại với câu hỏi 
		JOptionPane.showMessageDialog(null,"You've chosen: "
				+ (option == JOptionPane.YES_OPTION?"Yes":"No"));
		// Hiện ra lựa chọn đã chon
		System.exit(0);		
	}

}
