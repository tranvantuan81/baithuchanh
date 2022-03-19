import java.util.Scanner;
public class Phuongtrinhbac2 {
    double a, b, c, x1, x2;
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        a = sc.nextFloat();
        System.out.print("Nhap he so b: ");
        b = sc.nextFloat();
        System.out.print("Nhap he so c: ");
        c = sc.nextFloat();
    }
    int giaiphuongtrinh() {
        double delta = b*b - 4*a*c;
        if(delta<0) {
            x1 = x2 = 0.0;
            return 0;
        }
        else if(delta==0) {
            x1 = x2 = -b/(2*a);
            return 1;
        }
        else {
            delta = Math.sqrt(delta);
            x1 = (-b + delta) / (2*a);
            x2 = (-b - delta) / (2*a);
            return 2;
        }
    }  
    void in() {
        int songhiem = giaiphuongtrinh();
        if(songhiem == 0) 
            System.out.print("PT vo nghiem");
        else if(songhiem == 1) 
            System.out.print("PT co nghiem kep la: " + x1);
        else 
            System.out.print("PT co 2 nghiem la: x1 = " + x1 + " va x2 = " + x2);
    }
}

