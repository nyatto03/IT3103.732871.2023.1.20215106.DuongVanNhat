package hust.soict.hedspi.garbage;
import java.util.Random;

public class ConcatenationInLoops {

	public static void main(String[] args) {
		Random r = new Random(123);
		// tạo thực thể r ngẫu nhiên với seed để kết quả cố định sau mỗi lần chạy 
		long start = System.currentTimeMillis();
		// biến start lưu thời gian bắt đầu
		String s = "";
		for (int i = 0; i < 65536; i++)
			s += r.nextInt(2);
		// Sử dụng vòng lặp và string concatenation để tạo xâu
		System.out.println(System.currentTimeMillis() - start);
		// Tính thời gian chạy
		
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i =0; i < 65356; i++)
			sb.append(r.nextInt(2));
		// Sử dụng stringbuilder để xây xâu
		s = sb.toString();
		//Chuyển stringbuilder thành xâu
		System.out.println(System.currentTimeMillis() - start);
		// Tính thời gian chạy

	}

}
