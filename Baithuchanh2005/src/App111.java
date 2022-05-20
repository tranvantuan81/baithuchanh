import java.util.LinkedList;
import java.util.Scanner;
public class App111 {
   public static void main(String[] args) {
       int number;
       LinkedList<Integer> linkedList = new LinkedList<>();
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap so phan tu cua linkedList");
       int n = sc.nextInt();
       for(int i=0; i<n; i++) {
           System.out.print("Nhap phan tu thu " + i + ": ");
           number = sc.nextInt();
           linkedList.add(number);
       }
       int sum = 0, dem = 0;
       double tbCong;
       for (int i = 0; i < n; i++) {
        if (linkedList.get(i) % 2 == 0) {
            sum += linkedList.get(i);
            dem++;    
        }
    }  
    tbCong = (double)sum / dem;
    System.out.println("Trung binh cong cua cac so chan trong linkedList = " + tbCong);
    sc.close();   
   } 
}
