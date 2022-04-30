package Shape;
import java.util.Scanner;
public class Triangle extends Point {
    public float A, B, C;
    public Triangle(String tenDiem, float HoanhDo, float TungDo){
        super(tenDiem, HoanhDo, TungDo);
    }
    public float getA() { 
        return A;
    }
    public void setA(float A) {
        this.A = A;
    }
    public float getB() {
        return B;
    }
    public void setB(float B) {
        this.B = B;
    }
    public float getC() {
        return C;
    }
    public void setC(float C) {
        this.C = C;
    }

    public void kiemTra(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap A: ");
        A = sc.nextFloat();
        System.out.println("Nhap B: ");
        B = sc.nextFloat();
        System.out.println("Nhap C: ");
        C = sc.nextFloat();
        if (A + B > C || A + B > C || B + C > A || A > 0 || B > 0 || C > 0) {
            System.out.println("Day la tam giac");
        }
        else {
            System.out.println("Day khong phai la tam giac");
        }
        if(A == B || B == C || A == C ) {
            System.out.println("Tam giac can");
        }
        else if(A == B && B == C && A == C) {
            System.out.println("Tam giac deu");
        }
        else if(A * A == B * B + C * C || B * B == A * A + C * C || C * C == A * A + B * B) {
            System.out.println("Tam giac vuong");
        }
        else {
            System.out.println("Tam giac thuong");
        }  
    }  
}  