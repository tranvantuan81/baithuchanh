import java.util.Scanner;
import java.util.HashSet;
public class App55 {
    public static void main(String[] args) throws Exception {
      int number;
      HashSet<Integer> hashSetInteger = new HashSet<>();
      Scanner sc = new Scanner(System.in);
       hashSetInteger.add(0);
       hashSetInteger.add(3);
       hashSetInteger.add(1);
       hashSetInteger.add(4);
       hashSetInteger.add(2);
       hashSetInteger.add(8);
       System.out.println("Cac phan tu trong hashSetInteger: ");
       System.out.println(hashSetInteger);
       System.out.println("Nhap phan tu can them ");
       int n = sc.nextInt();
       for(int i=0; i<n; i++) {
        System.out.println("Nhap so phan tu can then");
        number = sc.nextInt();
        if(!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("Them thanh cong");
            System.out.println(hashSetInteger);
            System.out.println("Cac phan tru trong hashSetInteger sau khi them ");
            System.out.println(hashSetInteger);  
        }
        else {
            System.out.println("Phan tu " + number + "da ton tai ");
        }
       }
    sc.close();
    }
}
