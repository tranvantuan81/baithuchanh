package Employee;

import Person.Employee;
import java.util.Scanner;
public class FulltimeEmployee extends Employee {
    public float luong;
    public FulltimeEmployee(){
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
