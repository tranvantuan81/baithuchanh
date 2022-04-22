package Person;
import java.util.Scanner;
public class Customer extends Person {
    public String ngaymua;
    public void nhap(){
        System.out.println("Nhap ten khach hang");
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        System.out.println("Ngay mua :");
        ngaymua = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ten khach hang" +" " + ten +" " +"Ngay mua "+ " "+ngaymua );
    }
}
