import java.util.Scanner;
public class App1 {
public static void main (String[] args) {
int a, b ,tong ,hieu,tich,sodu;
float thuong;
Scanner scanner = new Scanner (System.in);
System.out.printf("nhap vao so thu nhat :");
a= scanner.nextInt();
System.out.printf("nhap vao so thu hai :");
b= scanner.nextInt();
    tong = a+b;
    hieu = a-b;
    tich = a*b;
    thuong =a/b;
    sodu = a%b;
System.out.println("Tong la :" +tong );
System.out.println("Hieu la :" +hieu);
System.out.println("tich la :" +tich);
System.out.println("thuong la :" +thuong);
System.out.println("so du la :" +sodu);
System.out.println("ket qua 2 so bang nhau " + a + " và " + 
                b + " là " + (a == b));
        System.out.println("ket qua 2 so khong bang nhau " + a + " và " + 
                b + " là " + (a != b));
        System.out.println("Kết quả so sánh lớn hơn 2 số " + a + " và " + 
                b + " là " + (a > b));
        System.out.println("Kết quả so sánh lớn hơn hoặc bằng 2 số " + a + " và " + 
                b+ " là " + (a >= b));
        System.out.println("Kết quả so sánh nhỏ hơn 2 số " + a + " và " + 
               b + " là " + (a < b));
        System.out.println("Kết quả so sánh nhỏ hơn hoặc bằng 2 số " + a + " và " + 
               b + " là " + (a <= b));
}   
}
