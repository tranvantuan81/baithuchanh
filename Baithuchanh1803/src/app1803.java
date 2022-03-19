public class app1803 {
    public static void main(String[] args) {
        Person ps = new Person();
        ps.nhap();
        ps.in();
        System.out.print("\n");
        SinhVien sv = new SinhVien();
        sv.nhap();
        sv.in();
        System.out.print("\n");
        PhuongTrinhBacHai pt = new PhuongTrinhBacHai();
        pt.nhap();
        pt.giaiphuongtrinh();
        pt.in();
    }
}