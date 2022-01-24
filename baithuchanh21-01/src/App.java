import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;       
        double x1, x2;       
        System.out.print("Nhap he so a = ");
        a = sc.nextDouble();
        System.out.print("Nhap he so b = ");
        b = sc.nextDouble();
        System.out.print("Nhap he so c = ");
        c = sc.nextDouble();
        double delta = b*b - 4*a*c;
        if(delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("PT co 2 nghiem: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if(delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("PT co nghiem kep: " + "x1 = x2 = " + x1);
        } else 
            System.out.println("PT vo nghiem");
        sc.close();
    }    
}