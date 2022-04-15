package shapes;
import java.util.Scanner;
public class hinhvuong extends hinhchunhat {
    public hinhvuong(){
        ten = " hinh vuong";
    }
    public void nhapcanh() {
        System.out.println("Cang =");
        Scanner scanner = new Scanner(System.in);
        dai = rong= scanner.nextFloat();
    }
}
