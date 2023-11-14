package bai2;

import java.util.*;

public class Running {

    public static void main(String[] args) {
        List<May> may = new ArrayList<>();
//TÉT CÂY        
//        May may1 = new May(01,"Asus","Ok");
//        May may2 = new May(02,"Lenovo","Baotri");
//        May may3 = new May(999999999,"MSI","OK");
//        May may4 = new May(4,"Omen","Baotri");
//        may.add(may1);
//        may.add(may2);
//        may.add(may3);
//        may.add(may4);
        QuanLy quanly = new QuanLy();
//TÉT CÂY
//        QuanLy quanly = new QuanLy("001","Joe Campos");
        Scanner s = new Scanner(System.in);
        PhongMay phongmay = new PhongMay();
//TÉT CÂY
//        PhongMay phongmay = new PhongMay("Cyber001","Viking Gaming",quanly,may);
        while (true) {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1: Nhập vào thông tin 1 phòng máy ");
            System.out.println("2: Xuất ra thông tin của phòng máy vừa nhập");
            System.out.println("3: Tìm kiếm máy theo kiểu máy");
            System.out.println("4: Tìm kiếm máy theo mã máy");
            System.out.println("0: Exit menu");
            System.out.println("");
            System.out.print("Your choice: ");
            int choice = s.nextInt();
            s.nextLine();
            System.out.println("");
            switch (choice) {
                case 1: {
                    System.out.println("");
                    phongmay.nhap();
                    quanly.nhap();
                    System.out.print("Nhap so may: ");
                    phongmay.setN(s.nextInt());
                    for (int i = 0; i < phongmay.getN(); i++) {
                        System.out.println("May thu 00" + (i + 1));
                        May com = new May();
                        com.nhap();
                        may.add(com);
                    }
                    break;
                }
                case 2: {
                    System.out.print("");
                    phongmay.xuat();
                    quanly.xuat();
                    for(May com: may){
                        com.xuat();
                    }
                    break;
                }
                case 3:{
//                    phongmay.setN(4);
                    System.out.println("");
                    System.out.print("Nhap Kieu may: ");
                    String kieumay = s.nextLine();
                    phongmay.timKiem(kieumay);
                    break;
                }
                case 4:{
//                    phongmay.setN(4);
                    System.out.print("Nhap ma may: ");
                    int mamay = s.nextInt();
                    s.nextLine();
                    phongmay.timKiem(mamay);
                    break;
                }
                case 0: {
                    System.out.println("");
                    System.out.println("Goodbyte !!!!");
                    return;
                }
                default:
                    break;
            }
        }
    }
}
