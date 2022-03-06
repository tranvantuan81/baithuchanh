import java.util.Scanner;
public class App5 {
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
        System.out.print("Nhap so: ");
        int n = sc.nextInt();
        sc.close();
        if(sht(n))
            System.out.print(n + " la so hoan thien");
        else    
            System.out.print(n + " khong la so hoan thien");
    }
}
