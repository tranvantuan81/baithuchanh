import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class App110 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(9);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(3);
        System.out.println("Cac phan tu co trong arrayList");
        System.out.println(arrayList);
        int max = arrayList.get(0);
        for(int i=0; i<arrayList.size(); i++) {
            if (arrayList.get(i).compareTo(max) > 0) {
                max = arrayList.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong mang la :" +max);
        System.out.print("Nhap vao so nguyen can them ");
        number = sc.nextInt();
        for(int i=0; i<arrayList.size(); i++) {
            if(arrayList.get(i) == number) {
                arrayList.remove(i);
            }
        }
        System.out.println("Phan tu trong arrayList la");
        System.out.println(arrayList);
        // sap xep theo thu tu giam dan 
        arrayList.sort(Comparator.naturalOrder());
        System.out.println("Cac phan tu sau khi sap xep");
        System.out.println(arrayList);
        sc.close();
    }
}
