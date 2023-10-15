// 6.5 Write a Java program to sort a numeric array, and calculate the sum and average value of array elements.

package lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] numericArray = new int[size];

        // Input array elements from the user
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numericArray[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(numericArray);

        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numericArray));

        // Calculate the sum of array elements
        int sum = 0;
        for (int num : numericArray) {
            sum += num;
        }

        // Calculate the average value
        double average = (double) sum / size;

        // Display the sum and average
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);

        // Close the scanner
        scanner.close();
    }
}

