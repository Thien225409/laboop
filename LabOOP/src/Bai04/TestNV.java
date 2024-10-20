package Bai04;

public class TestNV {
    public static void tongQuyLuong(NhanVien ... nhanvien ){
        double tongluong = 0;
        for(NhanVien nv : nhanvien){
            tongluong += nv.tinhLuong();
        }
        System.out.println(tongluong);
    }
}
