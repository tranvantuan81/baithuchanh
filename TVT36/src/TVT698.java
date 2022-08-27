import java.util.ArrayList;
import java.util.Scanner;
public class TVT698 extends Car {
    public String TVT698NCC;
    public String TVT698Color;
    Scanner sc = new Scanner(System.in);
    public TVT698() {

    }
    @Override
    public void NhapThongTin(){
        supper.NhapThongTin();
        System.out.println("Nhap thong tin cho TVT698NCC");
        TVT698NCC = sc.nextLine();
        System.out.println("Nhap thong tin cho TVT698Color");
        TVT698Color = sc.nextLine();
    } 
    @Override
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.println("Thong tin cua TVT698NCC" +TVT698NCC);
        System.err.println("Thong tin cua TVT698Color"+TVT698Color);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TVT698 tvt = new TVT698();
        tvt.NhapThongTin();
        tvt.HienThiThongTin();



    }
}
