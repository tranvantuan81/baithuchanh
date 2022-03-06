import java.util.Scanner;
public class App10 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n, i = 0;
        System.out.print("Nhap so: ");
        n = sc.nextInt();
        sc.close();
        while(n > 0) {
            n = n / 10;
            i++;          
        }
        System.out.print("Co " + i + " chu so");
    }
}