import java.util.Scanner;
public class App10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        int c = 0;
        do {
            System.out.print("Nhap chuoi: ");
            string = sc.nextLine();
        }while(string.length() > 80);
        System.out.print("Nhap ki tu: ");
        char ch = sc.next().charAt(0);
        sc.close();
        for(int i = 0; i < string.length(); i++) {
            if(ch == string.charAt(i))
                c++;
        }
        System.out.print("Ky tu " + ch + " xuat hien " + c + " lan trong chuoi vua nhap");
    }
}