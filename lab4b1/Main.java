package LAB4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Lab4 x = new Lab4();
    while (true){
        System.out.println("1. nhap thong tin");
        System.out.println("2. xuat thong tin");
        System.out.println("2. Tinh tong so luong");
        System.out.println("2. Tinh trung binh thanh tien giao dich dat");
        System.out.println("3. Thoat");
        int chon;
        chon = sc.nextInt();
        switch (chon){
            case 1:
                x.nhap();
                break;
            case 2:
                x.xuat();
                break;
            case 3:
                break;
            case 4:
                x.trungbinhthanhtiendat();
                break;
            case 5:
                break;
        }
    }
    }
}
