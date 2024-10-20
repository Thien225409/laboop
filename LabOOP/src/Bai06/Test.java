package Bai06;

import java.util.Scanner;

import Bai04.NhanVien;

public class Test {
    public static void main(String[] args) {
        String tenPhongBan;
        int lc;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao ten phong ban: ");
        tenPhongBan = sc.nextLine();

        PhongBan pb = new PhongBan(tenPhongBan);
        System.out.println("-----------MENU------------");
        do {            
            System.out.println("1.Them thong tin cho tung nhan vien");
            System.out.println("2.Xoa nhan vien");
            System.out.println("3.In thong tin nhan vien");
            System.out.println("4.Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            lc=sc.nextInt();
            sc.nextLine();
            if(lc==1){
                System.out.println("Nhap vao ten nhan vien: ");
                String tenNhanVien = sc.nextLine();

                System.out.println("Nhap vao luong co ban cua nhan vien: ");
                double luongCoBan = sc.nextDouble();

                System.out.println("Nhap vao he so luong cua nhan vien: ");
                double heSoLuong = sc.nextDouble();
                NhanVien nv = new NhanVien(tenNhanVien , luongCoBan , heSoLuong );
                pb.themNV(nv);
            }
            if(lc==2){
                pb.xoaNV();
            }
            if(lc==3){
                System.out.println("-------------------");
                System.out.println("Phong " + pb.getTenPhongBan() + " co " + pb.getSoNhanVien() + " nhan bao gom:" );
                pb.inTTin();
            } 
        } while (lc!=4);   
        sc.close();
    }
}
