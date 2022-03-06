import java.util.Scanner;
public class App6 {
    public static boolean sht(int n) {
        int tong = 0;
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0)
                tong += i;
        }
        if(tong == n)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 6; i <= n; i++) {
            if(sht(i))
                System.out.print(i + " ");
        }
    }
}