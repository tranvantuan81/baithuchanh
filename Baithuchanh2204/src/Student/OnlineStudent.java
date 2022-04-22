package Student;
import java.util.Scanner;
public class OnlineStudent extends Student {
    public String camnhan;
    public OnlineStudent(){
        cachhoc = "Hoc o nha ";
    }
    public void nhap(){
        System.out.println("Neu cam nhan khi hoc Onl :");
        Scanner sc = new Scanner(System.in);
        camnhan= sc.nextLine();
    }
    public void xuat(){
        System.out.println("Cam nhan la :" +camnhan);
    }
}

