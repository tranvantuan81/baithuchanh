import java.util.Scanner;
public class App9 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n, a = 0, b = 0;
        System.out.print("Nhap so: ");
        n = sc.nextInt();
        sc.close();
        while(n > 0) {
            a = n % 10;
            b = b * 10 + a;
            n = n / 10;
        }
        System.out.print(b);
    }
}