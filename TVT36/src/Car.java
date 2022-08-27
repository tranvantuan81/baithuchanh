
import java.util.Scanner;
public class Car {
    public String CarID;
    public String CarName;
    public double UnitPrice;
    Scanner sc = new Scanner(System.in);
public void NhapThongTin() {
    System.out.println("Nhap ma oto");
    CarID = sc.nextLine();
    System.out.println("Nhap ten oto");
    CarName = sc.nextLine();
    System.out.println("Nhap don gia");
    UnitPrice = sc.nextDouble();
}
public void HienThiThongTin() {
    System.out.println("Oto co ma la :" +CarID);
    System.out.println("Oto co ten la :" +CarName);
    System.out.println("Co don gia la :" +UnitPrice);
}
    public static void main(String[] args) throws Exception {
       Car car = new Car();
       car.NhapThongTin();
       car.HienThiThongTin();
       
    }
   
}
