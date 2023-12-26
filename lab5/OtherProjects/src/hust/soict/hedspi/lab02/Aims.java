package hust.soict.hedspi.lab02;
public class Aims {
   public static void main(String[] args)
   {
	   Cart anOrder = new Cart();
	    // Tạo cart mới với tên anOrder
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
		                 "Animation", "Roger Allers", 87, 19.95f );
	    anOrder.addDigitalVideoDisc(dvd1);
	    
	    DigitalVideoDisc dvd2 = new  DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f );
	    anOrder.addDigitalVideoDisc(dvd2);
	    
	    DigitalVideoDisc dvd3 = new  DigitalVideoDisc("Aladin",
                "Animation", 18.99f );
	    anOrder.addDigitalVideoDisc(dvd3);
	    //Tạo các disc mới
	    anOrder.showCart();
	    //Liệt kê những disc đang có trong cart hiện thời
	    System.out.println("Total Cost is: ");
	    System.out.println(anOrder.totalCost());
	    // Tính tổng chi phí của chúng
	    DigitalVideoDisc dvd4 = new  DigitalVideoDisc("Fate/stay night: Heaven's Feel",
                "Animation", 20.15f );
	    // Tạo disc mới
	    System.out.println("Testing the removeDigitalVideoDisc method");
	    anOrder.removeDigitalVideoDisc(dvd4);
	    // Thử loại bỏ disc mới
	    anOrder.removeDigitalVideoDisc(dvd3);
	    // Thử loại bỏ disc 3
	    anOrder.showCart();
	    // Liệt kê những disc đang có trong cart sau khi loại bỏ
   }
}
