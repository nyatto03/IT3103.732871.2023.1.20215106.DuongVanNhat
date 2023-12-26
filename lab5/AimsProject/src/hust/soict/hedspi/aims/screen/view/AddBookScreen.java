package hust.soict.hedspi.aims.screen.view;

import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import hust.soict.hedspi.aims.Cart;
import hust.soict.hedspi.aims.Store;
import hust.soict.hedspi.aims.screen.controller.AddBookScreenController;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddBookScreen extends JFrame{

	private Store store;
	private Cart cart;
	public AddBookScreen (Cart cart, Store store) { 
	super();
    this.store = store;
    this.cart = cart;
	
	JFXPanel fxPanel = new JFXPanel(); 
	this.add(fxPanel);

	this.setTitle("AddingBook");
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    // Mở rộng frame khi khởi tạo
    this.setSize(new Dimension(1024, 768));
	this.setVisible(true);
	Platform.runLater(new Runnable() { 
		@Override
		public void run() {
			try {
				//Lấy file fxml và chạy
				FXMLLoader loader = new FXMLLoader(getClass() 
						.getResource("/hust/soict/hedspi/aims/screen/view/AddBook.fxml"));
				AddBookScreenController controller =
						new AddBookScreenController(cart, store);
				loader.setController(controller);
				Parent root = loader.load();
				fxPanel.setScene(new Scene(root));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	});
	}
}
