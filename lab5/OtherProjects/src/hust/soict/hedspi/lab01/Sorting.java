package hust.soict.hedspi.lab01;
import java.util.Scanner;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] arg)
    { 
     Scanner scanner = new Scanner(System.in);
     System.out.print("Please enter the number of elements: ");
     int n = scanner.nextInt();
     // Nhập độ dài của array
     int[] A = new int[n];
     double sum, avg;
     sum =0;
     avg =0;
      System.out.println("Please enter the values of matrix A");
      for (int i = 0; i < n; i++)
        {
            System.out.println("A" + "[" + i +"]" );
            A[i] = scanner.nextInt();
            // Nhập các phần tử của array
            sum += A[i];
            // Tính tổng của array
            
        }
      avg= sum/ n;
      //Tính avg
     System.out.println(Arrays.toString(A));
     // In array trước khi sắp xếp   
     QuickSort(A,0,n-1);
     // Sử dụng quicksort để sắp xếp array
     System.out.println(Arrays.toString(A));
     // In array sao khi sắp xếp
     System.out.println("Sum: " + sum);
     System.out.println("Average " + avg);
     // In Sum và average

    }
    private static void swap(int[] arr, int i, int j) 
    // Method để tráo hai phần tử
      {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int left, int right)
    // Method thực hiện phần partition trong thuật toán quicksort 
      {
        int pivot = (left+right)/2;
        // Chọn pivot là vị trí giữa
        swap(arr,pivot,right);
        // Trao đổi pivot với phần từ cuối để thuận tiện cho việc code
        int store = left;
        for (int i =left; i <= right - 1; i++)
        {
            if (arr[i] < arr[right])
            {
             swap(arr,i,store);
             store ++;
            }
        }
        // Đẩy các phần tử bé hơn pivot sang phía bên phải
        swap(arr,store,right);
        // Đẩy pivot về vị trí chính xác
        return store;
      }

    private static void QuickSort(int[] arr, int left, int right) 
    // Thuật toán quick sort
      { int pi;
        if (left < right)
        {
          pi = partition(arr,left,right);
          // Lấy pivot
          QuickSort(arr,left,pi - 1);
          // Thực hiện đệ quy với phần bên trái pivot
          QuickSort(arr,pi + 1,right);
          // Thực hiện đệ quy với phần bên phải pivot
        }
      }
   

}