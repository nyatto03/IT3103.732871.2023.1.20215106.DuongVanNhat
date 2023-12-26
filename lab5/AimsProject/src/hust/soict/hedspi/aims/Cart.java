package hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.List;
import hust.soict.hedspi.aims.media.*;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {

	public static final int MAX_NUMBERS_ORDERED = 20;
	private ObservableList<Media> itemOrdered = FXCollections.observableArrayList();
	// Sử dụng observableList để tự động cập nhật cho giao diện
	private SimpleFloatProperty totalCostProperty = new SimpleFloatProperty(0);

	// Sử dụng SimpleFloatProperty để tự động cập nhật tổng giá trị của hàng trong
	// cart
	// Sử dụng list để tiện cho việc remove
	public void addMedia(Media item) { // Method cho việc thêm media
		if (itemOrdered.size() == MAX_NUMBERS_ORDERED) { // Nếu kích thước của list = tối đa thì gửi thông báo
			throw new CartException("The cart is full. Cannot add more items.");
		} else {
			// Nếu không thì thêm media vào cart và thông báo thêm thành công
			itemOrdered.add(item);
			totalCostProperty.set(item.getCost() + totalCostProperty.get());
			// Mỗi khi thêm media thì tăng totalcostproperty lên
			System.out.println("The item has been added");
		}
	}

	public void addMedia(Media... item) { // Method cho việc thêm disc với arg tùy ý
		if (itemOrdered.size() == MAX_NUMBERS_ORDERED) { // Nếu kích thước của list = tối đa thì gửi thông báo
			throw new CartException("The cart is full. Cannot add more items.");
		} else {
			if (itemOrdered.size() + item.length == MAX_NUMBERS_ORDERED) { // Nếu cart không đủ chỗ để thêm list thì gửi
																			// thông báo
				throw new CartException("There are not enough spots in the cart");
			} else {
				for (Media it : item) {
					itemOrdered.add(it);
					totalCostProperty.set(it.getCost() + totalCostProperty.get());
					// Dùng vòng lặp và thêm từ từ item từ list vào
					// Mỗi khi thêm media thì tăng totalcostproperty lên
				}
				System.out.println("The list of items has been added successfully");
			}
		}
	}

	public void addMedia(Media item1, Media item2) { // Method cho việc thêm media với 2 arg
		if (itemOrdered.size() + 2 > MAX_NUMBERS_ORDERED) { // Nếu cart không đủ chỗ để chứa thì gửi thông báo thì gửi
															// thông báo
			throw new CartException("The cart is full. Cannot add more items.");
		} else {
			// Nếu không thì thêm media vào cart và thông báo thêm thành công
			itemOrdered.add(item1);
			itemOrdered.add(item2);
			totalCostProperty.set(item1.getCost() + totalCostProperty.get());
			totalCostProperty.set(item2.getCost() + totalCostProperty.get());
			// Mỗi khi thêm media thì tăng totalcostproperty lên
			System.out.println("Both items have been added");
		}
	}

	public void removeMedia(Media item) { // Method cho việc loại bỏ media
		if (itemOrdered.isEmpty()) { // Nếu list trống thì thông báo cart trống
			throw new CartException("The cart is empty. Cannot remove items.");
		}
		if (itemOrdered.remove(item)) { // Nếu loại bỏ thành công thì gửi thông báo
			System.out.println("The item is removed successfully");
			totalCostProperty.set(totalCostProperty.get() - item.getCost());
			// Mỗi khi loại bỏ media thì giảm totalcostproperty xuống
		} else { // Nếu không loại bỏ thành công thì gửi thông báo item không có trong cart
			throw new CartException("The item is not in the cart.");
		}

	}

	public void showCart() { // Method để liệt kê những gì có trong cart và chi phí của chúng
		int i = 1;
		System.out.println("***********************CART***********************");
		for (Media item : itemOrdered) {
			System.out.println(i + ".item - " + item.toString());
			i++;
			// Duyệt lần lượt qua cart và in kết quả
		}
		System.out.print("Total Cost: ");
		System.out.println(totalCostProperty.get());
		System.out.println("***************************************************");
	}

	public void emptyCart() {
		// Method để làm rõng giỏ hàng cho khi place order
		itemOrdered.clear();
		totalCostProperty.set(0);
		// total cost về 0
		System.out.println("The cart has been emptied.");
	}

	public ObservableList<Media> getItemOrdered() {
		return itemOrdered;
	}
	// Getter để lấy xem trong cart có gì

	public SimpleFloatProperty getTotalCostProperty() {
		return totalCostProperty;
	}

	// Getter để trả lại tổng giá trị

	public Media searchByTitle(String Title) { // Method để tìm bằng title
		int count = 1;
		Media result = null;
		for (Media item : itemOrdered) {
			if (item.isMatch(Title)) {// Duyệt lần lượt qua cart và kiểm tra xem title của media có chứa xâu dùng để
										// tra không
				System.out.println(count + ".item -" + item.toString());
				result = item;
				count++;
				// nếu có thì in ra và tăng count
			}

		}
		if (count == 1) { // Nếu count không đổi thì in ra không tìm được
			System.out.println("No results found");
			return null;
			// trả về null khi không tìm thấy
		}
		return result;
		// trả về kết quả cuối
	}

	public void searchById(int Id) {
		int count = 1;
		for (Media item : itemOrdered) {
			if (Id == item.getId()) {// Duyệt tuần tự qua cart và kiểm tra xem id có trùng không
				System.out.println(count + ".item -" + item.toString());
				count++;
				// Nếu có thì in ra và tăng count rồi break vì id là duy nhất
				break;
			}

		}
		if (count == 1) { // nếu count không đổi thì in ra là không tìm được
			System.out.println("No results found");
		}

	}

	public void sortByTitle() {
		java.util.Collections.sort(itemOrdered, Media.COMPARE_BY_TITLE_COST);
	}

	public void sortByCost() {
		java.util.Collections.sort(itemOrdered, Media.COMPARE_BY_COST_TITLE);
	}

	public class CartException extends RuntimeException {
		public CartException(String message) {
			super(message);
		}
	}

}