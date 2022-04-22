import java.util.Scanner;
public class App11 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        sc.close();
        int t;
        for(int i = 0; i < n - 1; i++)
            for(int j = 0; j < n - 1 - i; j++)
                if(b[j] > b[j + 1]) {
                    t = b[j];
                    b[j] = b[j+1];
                    b[j+1] = t;    
                }
        System.out.print("Mang ban dau: ");
        for(int i = 0; i < n; i++) 
            System.out.print(a[i] + " ");
        System.out.print("\nMang khi sap xep: ");
        for(int i = 0; i < n; i++)
            System.out.print(b[i] + " ");
    }
}
