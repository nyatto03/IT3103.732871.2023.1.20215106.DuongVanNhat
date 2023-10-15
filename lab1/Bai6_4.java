// 6.4 Write a program to display the number of days of a month, which is entered by users (both month and year). If it is an invalid month/year, ask the user to enter again.


package lab1;

import java.util.Scanner;

public class Bai6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the month from the user
        int month;
        do {
            System.out.print("Enter the month (1-12): ");
            month = scanner.nextInt();
        } while (month < 1 || month > 12);

        // Get the year from the user
        int year;
        do {
            System.out.print("Enter the year: ");
            year = scanner.nextInt();
        } while (year < 0);

        // Display the number of days
        int daysInMonth = getDaysInMonth(month, year);
        if (daysInMonth != -1) {
            System.out.println("Number of days in month " + month + ", year " + year + ": " + daysInMonth);
        } else {
            System.out.println("Invalid month or year.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to get the number of days in a month
    private static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 0) {
            return -1; // Invalid input
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1; // Invalid month
        }
    }

    // Function to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
