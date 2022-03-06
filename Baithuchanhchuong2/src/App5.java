import java.util.Scanner;
public class App5 {
    public static void main(String[] args) {
        int n , sum=0;
        Scanner sc = new Scanner(System.in);
        while(sum<100) {
            System.out.printf("nhap vao cac so:");
        n = sc.nextInt();
        sum += n;
        }
        System.out.printf("tong là :"   +sum);
    }
}