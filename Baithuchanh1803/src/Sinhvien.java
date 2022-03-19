import java.util.Scanner;
public class Sinvien {
    String MaSv, HoTen, DiaChi;
    Boolean Gioitinh;
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        MaSv = sc.nextLine();
        System.out.print("Nhap ho ten sinh vien: ");
        HoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        DiaChi = sc.nextLine();
    }
    void in() {
            System.out.println("Ma sinh vien: " + MaSv);
            System.out.println("Ho ten sinh vien: " + HoTen);
            System.out.println("Dia chi: " + DiaChi);
    }
} 
}
