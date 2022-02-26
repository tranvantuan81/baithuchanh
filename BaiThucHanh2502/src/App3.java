import static java.lang.Math.sqrt;
import java.util.Scanner;
public class App3 {
    public static void main(String[] args) {
        int n, i, c=1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap n :");
            n =  (int)scanner.nextInt();
        } while(n<=0);
        for(i=2; i<=sqrt(n); i++) {
            if(n%i==0)
                      c = 0;
   }
   if(c==0)
   System.out.printf("so n  khong la so nguyen to:%d",n);
   else 
   System.out.printf("so n la so nguyen to: %d",n );
}
}



