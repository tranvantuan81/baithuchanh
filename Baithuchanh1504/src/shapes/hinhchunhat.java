package shapes;
import java.util.Scanner;
public class hinhchunhat extends hinhhoc {
    public float dai;
    public float rong;
    public hinhchunhat(){
        ten = "hinh chu nhat";
    }
    public void nhapchieudai(){
        System.out.println("Nhap chieu dai = ");
        Scanner scanner =  new Scanner(System.in);
        chieudai = scanner.nextFloat();
    }
    public void nhapchieurong(){
        System.out.println("Nhap chieu rong = ");
        Scanner scanner =  new Scanner(System.in);
        chieurong = scanner.nextFloat();
}
    public void tinhchuvi(){
        chuvi = 2*(dai + rong);
}
    public void tinhdientich(){
        dientich= dai * rong;
    }
}