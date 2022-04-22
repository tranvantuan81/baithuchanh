import java.util.Scanner;
public class App9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kytuthuong = 0, kytuhoa = 0, so = 0;
        System.out.print("Nhap chuoi: ");
        String string = sc.nextLine();
        sc.close();
        for(int i = 0; i < string.length(); i++) {
            if(Character.isLowerCase(string.charAt(i)))
                kytuthuong++;
            else if(Character.isUpperCase(string.charAt(i)))
                kytuhoa++;
            else if(Character.isDigit(string.charAt(i)))
                so++;
        }
        System.out.print("Co " + kytuthuong + " ky tu thuong, " + kytuhoa + " ky tu hoa, " + so + " so trong chuoi vua nhap");
    }
}