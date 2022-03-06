import java.util.Scanner;
public class App8 {
    public static void main(String[] arg) {
        int n , tong=0, a;
        float tbc;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap vao day so :");
        n= sc.nextInt();
        for (int i =1;i <=n;i++) {
            System.out.printf("nhap vao so " + i + ":");
            a = sc.nextInt();
            tong +=a;
        }
        tbc = (float) tong/n;
        System.out.printf("trung bing cong la:" + tbc);
    }
} 