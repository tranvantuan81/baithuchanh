package Student;
import java.util.Scanner;
public class OfflineStudent extends Student {
    public String camnhan;
    public OfflineStudent(){
        cachhoc = "Hoc tai truong ";
    }
    public void nhap(){
        System.out.println("Neu cam nhan khi hoc Off :");
        Scanner sc = new Scanner(System.in);
        camnhan= sc.nextLine();
    }
    public void xuat(){
        System.out.println("Cam nhan khi hoc Off la :" +camnhan);
    }
}
