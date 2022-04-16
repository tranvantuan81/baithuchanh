package model;
import util.configs;

public class nhanvienfulltime extends nhanvien {
    protected int ngaylamthem;
    protected int loaichucvu;

    public nhanvienfulltime(String ten) {
        this.ten = ten;
    }

    public nhanvienfulltime(String ten, int ngaylamthem) {
        this.ten = ten;
        this.ngaylamthem = ngaylamthem;
    }

    public void setLoaiChucVu(int loaichucvu) {
        this.loaichucvu = loaichucvu;
    }

    public String loainhanvien() {
        if(loaichucvu == configs.NHAN_VIEN_SEP)
            return "Nhan vien sep.";
        else 
            return "Nhan vien linh.";
    }

    public void tinhluong() {
        if(loaichucvu == configs.NHAN_VIEN_SEP)
            luong = configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngaylamthem * configs.LUONG_LAM_THEM_MOI_NGAY;
        else 
            luong = configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngaylamthem * configs.LUONG_LAM_THEM_MOI_NGAY;
    }
}