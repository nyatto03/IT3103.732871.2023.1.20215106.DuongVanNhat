// package lab1;

import java.util.Scanner;

public class Bai2_6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int option;

            do {
                System.out.print("1. Giai phuong trinh bac 1\n2. Giai he phuong trinh\n3. Giai phuong trinh bac 2\n4. Exit\n");
                option = scanner.nextInt();

                switch (option) {
                    case 1 -> {
                        System.out.print("a: ");
                        int a = scanner.nextInt();
                        System.out.print("b: ");
                        int b = scanner.nextInt();
                        linearEquation(a, b);
                        break;
                    }
                    case 2 -> {
                        SystemEquations(scanner);
                        break;
                    }
                    case 3 -> {
                        TwoDegreeEquation(scanner);
                        break;
                    }
                    case 4 -> {
                        System.out.println("Goodbye!");
                        break;
                    }
                    default -> {
                        System.out.println("Please re-enter");
                        break;
                    }
                }
            } while (option != 4);
        }
    }

    public static void linearEquation(int a, int b) {
        System.out.print("Result: ");
        System.out.println((a == 0 && b == 0) ? "Infinite solutions" : ((a == 0) ? "No solution" : (double) (-b) / a));
    }

    public static void SystemEquations(Scanner scanner) {
        System.out.print("a11: ");
        int a11 = scanner.nextInt();
        System.out.print("a12: ");
        int a12 = scanner.nextInt();
        System.out.print("b1: ");
        int b1 = scanner.nextInt();
        System.out.print("a21: ");
        int a21 = scanner.nextInt();
        System.out.print("a22: ");
        int a22 = scanner.nextInt();
        System.out.print("b2: ");
        int b2 = scanner.nextInt();

        int D = a11 * a22 - a21 * a12;
        int D1 = b1 * a22 - b2 * a12;
        int D2 = b2 * a11 - b1 * a21;

        System.out.println("x1: " + (double) D1 / D);
        System.out.println("x2: " + (double) D2 / D);
    }

    public static void TwoDegreeEquation(Scanner scanner) {
        System.out.print("a b c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == 0) {
            linearEquation(b, c);
        } else {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("No solution");
            } else if (delta == 0) {
                System.out.println("x: " + (double) -b / (2 * a));
            } else {
                System.out.println("x1: " + (double) ((-b + Math.sqrt(delta)) / (2 * a)) + " x2: "
                        + (double) ((-b - Math.sqrt(delta)) / (2 * a)));
            }
        }
    }
}