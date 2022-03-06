import java.util.Scanner;
public class App3 {
    public static void main(String[] args) {
        int tuoi , nam ;
        String ten, nhomtuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap ten cua ban :");
        ten = scanner.nextLine();
        System.out.printf("nhap nam sinh cua ban :");
        nam = scanner.nextInt();
        tuoi = 2022 - nam;
        if(tuoi <16) {
            nhomtuoi = " o do tuoi vi thanh nien "; 
        }
        else if (tuoi >=16 && tuoi<18) {

        nhomtuoi =" o do tuoi truong thanh ";       
        }
        else 
            nhomtuoi = " da gia ";
    System.out.printf(" Ban " + ten + nhomtuoi);

    }
}
