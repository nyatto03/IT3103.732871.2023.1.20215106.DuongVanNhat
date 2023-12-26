package hust.soict.hedspi.javafx;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Painter extends Application{

	@Override

	public void start(Stage stage) throws Exception {

		Parent root = FXMLLoader.load(getClass()
				.getResource("/hust/soict/hedspi/javafx/Painter.fxml"));
        //Lấy file fxml
		Scene scene = new Scene(root);
		stage.setTitle("Painter"); 
		stage.setScene(scene);
		stage.show();
		//Khởi tạo

	}
	public static void main(String[] args) {
		launch(args);
		
		//Chạy
	}
}