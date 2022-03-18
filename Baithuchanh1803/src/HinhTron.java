import java.util.Scanner;
public class HinhTron {
    final float PI = 3.14f;
    float r, cv, dt;
    void nhapbankinh() {
        System.out.print("Nhap ban kinh: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }
    void tinhchuvi() {
        cv = 2 * PI * r;
    }
    void tinhdientich() {
        dt = PI * r * r;
    }
    void inchuvi() {
        System.out.println("Chu vi hinh tron = " + cv);
    }
    void indientich() {
        System.out.println("Dien tich hinh tron = " + dt);
    }
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();
    }
}