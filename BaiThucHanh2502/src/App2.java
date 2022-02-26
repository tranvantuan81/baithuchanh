import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap 3 canh cua tam giac:");
        System.out.print("Nhap canh thu nhat:");
        a = (int)scanner.nextInt();
        System.out.print("Nhap canh thu hai:");
        b = (int)scanner.nextInt();
        System.out.print("Nhap canh thu ba:");
        c = (int)scanner.nextInt();
        scanner.close();
        if ((a + b)>= c || (a + c) >= b || (b + c) >= a) {
			System.out.println("Day la tam giac !");
		}
		 else if ((a == b) && (b == c) && (c == a)) {
			System.out.println("Day la tam giac deu  !");
		} else if ((a == b) || (b == c) || (c == a)) {
			System.out.println("Day la tam giac can !");
		} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
			System.out.println("Day la tam giac vuong!");
		} else {
			System.out.println("Day khong phai la tam giac");
		}
	}
}




