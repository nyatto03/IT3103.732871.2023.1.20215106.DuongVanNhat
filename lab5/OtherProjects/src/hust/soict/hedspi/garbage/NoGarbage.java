package hust.soict.hedspi.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {

	public static void main(String[] args) throws IOException {
		String filename = "C:\\Users\\asiat\\Downloads\\CiscoPacketTracer_821_Windows_64bit.exe";
		//Đường đi đến file
		byte[] inputBytes = {0};
		//Khai báo 1 array với kiểu byte
		long startTime, endTime;
		
		inputBytes = Files.readAllBytes(Paths.get(filename));
		//Đọc byte từ file đã cho
		startTime = System.currentTimeMillis();
		//Thời gian bắt đầu
		StringBuilder outputStringBuilder = new StringBuilder();
		for (byte b : inputBytes)
		{
			outputStringBuilder.append((char)b);
		}
		// Xây xâu sử dụng string builder
		endTime = System.currentTimeMillis();
		// Thời gian kết thúc
		System.out.println(endTime - startTime);
		// Tính thời gian chạy

	}

}