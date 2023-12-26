package hust.soict.hedspi.javafx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;

public class PainterController {
    
	private Color penColor = Color.BLACK;
	//Biến lưu giữ màu
	
	@FXML
	private Pane drawingAreaPane;
	
	@FXML
    private RadioButton Pen;
	
	@FXML
    private RadioButton Eraser;
	//Các thuộc tính khác
    @FXML
    void clearButtonPressed(ActionEvent event) {
         drawingAreaPane.getChildren().clear();
         //Khi xóa bảng 
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
         Circle newCircle = new Circle(event.getX(),
        		 event.getY() , 4,penColor);
         drawingAreaPane.getChildren().add(newCircle);
         //Khi vẽ
    }
    
    @FXML
    public void initialize() {
        ToggleGroup toggleGroup = new ToggleGroup();
        Pen.setToggleGroup(toggleGroup);
        Eraser.setToggleGroup(toggleGroup);
        
        Pen.setSelected(true);
        
        // Event handlers khi chọn pen hoặc eraser
        Pen.setOnAction(this::handlePenSelection);
        Eraser.setOnAction(this::handleEraserSelection);
    }

    private void handlePenSelection(ActionEvent event) {
    	penColor = Color.BLACK;
    	//Chọn bút thì màu đen
    }

    private void handleEraserSelection(ActionEvent event) {
        // Chọn tẩy màu trắng
    	penColor = Color.WHITE;
    }
    
    
    
}
