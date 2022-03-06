import java.util.Scanner;
public class App8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, temp = 0;
        while(a != 0) {
            System.out.print("Nhap so nguyen: ");
            a = sc.nextInt();
            if(a % 5 == 0 && a > temp)
                temp = a;
        }
        sc.close();
        System.out.print("Gia tri lon nhat trong cac so chia het cho 5 vua nhap la: " + temp);
    }
}
