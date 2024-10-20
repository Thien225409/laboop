package Bai04;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public static int countNhanVien = 0;

    public final double LUONG_CO_BAN = 750000;
    public final double LUONG_MAX = 20000000;
    

    public NhanVien(String tenNhanVien , double luongCoBan , double heSoLuong){
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        countNhanVien ++;
        // Biến counNhanVien là một biến static int, counNhanVien sẽ tăng lên 
        // khi tạo ra một đối tượng mới từ class NhanVien, và được lưu giá trị 
        // ngược trở lại countNhanVien
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    public double getLuongCoBan() {
        return luongCoBan;
    }
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public boolean tangLuong(double luongTang){
        double luongAfterTang = getHeSoLuong() * (luongTang + getLuongCoBan());
        if(luongAfterTang > LUONG_MAX) return false;
        else{
            setLuongCoBan(getLuongCoBan() + luongTang);
            return true;
        }
    }
    public double tinhLuong(){
        double tongLuong;
        tongLuong = getHeSoLuong() * getLuongCoBan();
        return tongLuong;
    }
    public void inTTin(){
        System.out.println("Ten nhan vien: " + getTenNhanVien());
        System.out.println("Luong co ban: " + getLuongCoBan());
        System.out.println("He so Luong: " + getHeSoLuong());
        System.out.println("Luong cua " + getTenNhanVien() + " la " + tinhLuong() + "\n");
    }
}
