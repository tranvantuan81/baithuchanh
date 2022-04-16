public package model;
import util.configs;
public class nhanvienparttime extends nhanvien {
    private int giolamviec;

    public nhanvienparttime(String ten, int giolamviec) {
        this.ten = ten;
        this.giolamviec = giolamviec;
    }

    public String loainhanvien() {
        return "Nhan vien thoi vu";
    }

    public void tinhluong() {
        luong = configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * giolamviec;
    }
}
    
}
