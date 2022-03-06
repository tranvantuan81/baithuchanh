import java.util.Scanner;
public class App7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 1, max = 0;
        while(a != 0) {
            System.out.print("Nhap so thuc: ");
            a = sc.nextDouble();
            if(max < a)
                max = a;
        }
        sc.close();
        System.out.print("So lon nhat trong cac so vua nhap la: " + max);
    }
}