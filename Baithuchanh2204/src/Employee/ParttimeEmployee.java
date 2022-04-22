package Employee;
import java.util.Scanner;
import Person.Employee;

public class ParttimeEmployee extends Employee {
    public float luong;
    public ParttimeEmployee(){
        nhanvien = "Nhan vien Parttime";
    }
    public void nhap(){
        System.out.println("Nhap luong = ");
        Scanner sc = new Scanner(System.in);
        luong = sc.nextFloat();
    }
    public void xuat(){
        System.out.println("Luong =" +luong);
    }
}
