import java.util.Scanner;
public class App12 {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dong cua ma tran: ");
        m = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + (i + 1) + "]["+ (j + 1) + "]= ");
                a[i][j] = sc.nextInt();  
            }
        }
        sc.close();
        int max = a[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < a[i][j]) 
                    max = a[i][j];
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran = " + max);
    }
}