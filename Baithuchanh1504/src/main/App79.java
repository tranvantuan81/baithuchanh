package main;
import model.nhanvienparttime;
import model.nhanvienfulltime;
import util.configs;

public class App79 {
    public static void main(String[] args) {
        nhanvienfulltime sep = new nhanvienfulltime("Tran Van Sep");
        sep.setLoaiChucVu(configs.NHAN_VIEN_SEP);
        nhanvienfulltime linh1 = new nhanvienfulltime("Nguyen Van Linh");
        nhanvienfulltime linh2 = new nhanvienfulltime("Le Thi Linh", 3);
        nhanvienparttime thoivu = new nhanvienparttime("Phan Thi Thoi Vu", 240);

        sep.tinhluong();
        linh1.tinhluong();
        linh2.tinhluong();
        thoivu.tinhluong();

        sep.xuatthongtin();
        linh1.xuatthongtin();
        linh2.xuatthongtin();
        thoivu.xuatthongtin();
    }
}
