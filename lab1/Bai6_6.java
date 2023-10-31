
import java.util.Scanner;

import java.util.Random;

public class Bai6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so hang cua ma tran: ");
        int hang = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int cot = scanner.nextInt();

        int[][] maTran1 = nhapMaTran(scanner, hang, cot, "dau tien");
        int[][] maTran2 = nhapMaTran(scanner, hang, cot, "thu hai");

        System.out.println("\nMa Tran 1:");
        hienThiMaTran(maTran1);

        System.out.println("\nMa Tran 2:");
        hienThiMaTran(maTran2);

        int[][] ketQua = congHaiMaTran(maTran1, maTran2);

        System.out.println("\nMa Tran Ket Qua:");
        hienThiMaTran(ketQua);

        scanner.close();
    }

    private static int[][] nhapMaTran(Scanner scanner, int hang, int cot, String tenMaTran) {
        System.out.println("Chon cach nhap ma tran " + tenMaTran + ":");
        System.out.println("1. Nhap tu nguoi dung");
        System.out.println("2. Sinh ngau nhien");

        int luaChon = scanner.nextInt();
        int[][] maTran = new int[hang][cot];

        switch (luaChon) {
            case 1:
                System.out.println("Nhap cac phan tu cho ma tran " + tenMaTran + ":");
                for (int i = 0; i < hang; i++) {
                    for (int j = 0; j < cot; j++) {
                        System.out.print("Nhap phan tu tai vi tri [" + (i + 1) + "][" + (j + 1) + "]: ");
                        maTran[i][j] = scanner.nextInt();
                    }
                }
                break;

            case 2:
                System.out.println("Ma tran " + tenMaTran + " duoc sinh ngau nhien:");
                Random random = new Random();
                for (int i = 0; i < hang; i++) {
                    for (int j = 0; j < cot; j++) {
                        maTran[i][j] = random.nextInt(100); // Giả sử giá trị ngẫu nhiên từ 0 đến 99
                    }
                }
                break;

            default:
                System.out.println("Lua chon khong hop le. Su dung mac dinh la nhap tu nguoi dung.");
                return nhapMaTran(scanner, hang, cot, tenMaTran);
        }

        return maTran;
    }

    private static int[][] congHaiMaTran(int[][] maTran1, int[][] maTran2) {
        int hang = maTran1.length;
        int cot = maTran1[0].length;
        int[][] ketQua = new int[hang][cot];

        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                ketQua[i][j] = maTran1[i][j] + maTran2[i][j];
            }
        }
        return ketQua;
    }

    private static void hienThiMaTran(int[][] maTran) {
        for (int[] hang : maTran) {
            for (int phanTu : hang) {
                System.out.print(phanTu + " ");
            }
            System.out.println();
        }
    }
}