package Person;
import java.util.Scanner;
public class Employee extends Person {
    public String nhanvien;
    public void nhap() {
        System.out.println("Nhap ten nhan vien :");
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        System.out.println("Nhap tuoi nhan vien :");
        tuoi = sc.nextInt();
    }
    public void xuat() {
        System.out.println("Nhan vien :" +nhanvien);
    }
}
