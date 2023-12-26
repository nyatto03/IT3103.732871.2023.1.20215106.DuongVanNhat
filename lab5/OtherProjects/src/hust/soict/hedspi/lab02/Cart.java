package hust.soict.hedspi.lab02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cart {
  
	public static final int MAX_NUMBERS_ORDERED = 20;
	private List<DigitalVideoDisc> itemOrdered = 
			new ArrayList<>(); 
	private int qtyOrdered;
	// Sử dụng list để tiện cho việc remove
	public void addDigitalVideoDisc (DigitalVideoDisc disc)
	{   // Method cho việc thêm disc
		if ( itemOrdered.size() == MAX_NUMBERS_ORDERED)
			{ //Nếu kích thước của list = tối đa thì gửi thông báo
			 System.out.println("The cart is almost full");
			 return;
			}
		else 
		   {
			// Nếu không thì thêm disc vào cart và thông báo thêm thành công
			itemOrdered.add(disc);
			System.out.println("The disc has been added");
		   }
	}
	public void removeDigitalVideoDisc (DigitalVideoDisc disc)
	{       // Method cho việc loại bỏ disc
            if (itemOrdered.isEmpty())
            {   //Nếu list trống thì thông báo cart trống
            	System.out.println("The cart is empty");
            	return;
            }
            if (itemOrdered.remove(disc))
            {   // Nếu loại bỏ thành công thì gửi thông báo
            	System.out.println("The disc is removed successfully");
            }
            else
            {   // Nếu không loại bỏ thành công thì gửi thông báo disc không có trong cart
            	System.out.println("The disc is not in the cart");
            }
		
	}
	public float totalCost ()
	{   //Method tính tổng cost
		float total =0;
		for (DigitalVideoDisc disc : itemOrdered) {
             total += disc.getCost();
        }
		// Duyệt tuần tự qua cart và tính tổng cost
		return total;
	}
	
	public void showCart ()
	{   // Method để liệt kê những gì có trong cart và chi phí của chúng
		int i = 1;
		for (DigitalVideoDisc disc : itemOrdered) {
			 System.out.println(i + " " + disc.getTitle() + " " + disc.getCost());
        }
	}
}
