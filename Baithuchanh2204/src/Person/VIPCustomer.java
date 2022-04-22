package Person;
import java.util.Scanner;
public class VIPCustomer extends Person {
    public String uudai;
    public void nhap(){
        System.out.println("Nhap ten khach hang");
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        System.out.println("Uu dai :");
        uudai = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ten khach hang " +" "+ten);
        System.out.println("Uu dai "+" " +uudai);
    }
}
