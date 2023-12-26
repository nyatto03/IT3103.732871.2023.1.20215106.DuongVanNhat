package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	public Book(String title) {
        super(title);
    }
	public Book(String title, String category, float cost) {
		super(title,category,cost);
	}
	//Các constructor cho class
	public void addAuthor(String authorName)
	{   // Method cho việc thêm authorName
		if ( authors.contains(authorName))
			{ //Kiểm tra xem tên tác giả có trong list chưa
			throw new BookException("The author name is already presented.");
			}
		else 
		   {
			// Nếu không thì thêm vào và thông báo thêm thành công
			authors.add(authorName);
			System.out.println("Author's name has been added successfully");
		   }
	}
	
	public void removeAuthor(String authorName)
	{   // Method cho việc xoa authorName
		if ( authors.contains(authorName))
			{ //Kiểm tra xem tên tác giả có trong list chưa
			 authors.remove(authorName);
			 throw new BookException("This author's name is not presented, can't remove it");
			}
		else 
		   {
			// Nếu không thì báo lỗi
			System.out.println("This author's name is not presented, can't remove it");
		   }
	}
	
	public String toString() 
		{// Phương thức chuyển các thông tin của Book thành string rồi trả lại
			String cd;
			cd = getTitle() + " - " + getCategory() + " - "  + getCost();
			return cd;
		}
	
	
	public Book() {
		
		
	}
	
	public class BookException extends RuntimeException {
		// class exception
	    public BookException(String message) {
	        super(message);
	    }
	}

}
