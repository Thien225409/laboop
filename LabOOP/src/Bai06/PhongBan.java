package Bai06;
import java.util.LinkedList;
import java.util.List;
import Bai04.NhanVien;

public class PhongBan {
    private String tenPhongBan;
    private byte soNhanVien;
    public final byte SO_NV_MAX = 100; 
    List<NhanVien> dsNhanVien = new LinkedList<NhanVien>();
    
    public String getTenPhongBan() {
        return tenPhongBan;
    }
    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }
    public byte getSoNhanVien() {
        return soNhanVien;
    }

    public PhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }
    public boolean themNV(NhanVien nv){
        if(dsNhanVien.size() <= SO_NV_MAX) {
            dsNhanVien.addFirst(nv);
            soNhanVien++;
            return true;
        }
        else {
            System.out.println("Phong ban da day");
            return false;
        }
    }
    public NhanVien xoaNV(){
        NhanVien nvRemove = dsNhanVien.getFirst();
        dsNhanVien.removeFirst();
        soNhanVien--;
        return nvRemove;
        
    }
    public double tongLuong(){
        double tongluong = 0;
        for(NhanVien nv : dsNhanVien){
            tongluong += nv.tinhLuong();
        }
        return tongluong;
    }
    public void inTTin(){
        for(NhanVien nv : dsNhanVien){
            nv.inTTin();
        }
         System.out.println("Tong luong cua phong " + getTenPhongBan() + " la " + this.tongLuong());
        // System.out.println("So nhan vien cua phong " + getTenPhongBan() + " la " + this.soNhanVien);
    }

    // public static void main(String[] args) {
    //     NhanVien nv1 = new NhanVien("Thien", 2000, 2.5);
    //     NhanVien nv2 = new NhanVien("Thanh", 3000, 2);
    //     PhongBan p1 = new PhongBan();
    //     p1.setTenPhongBan("Phong 1");
    //     p1.themNV(nv1);
    //     p1.themNV(nv2);
    //     p1.xoaNV();
    //     p1.inTTin();
    // }
}
