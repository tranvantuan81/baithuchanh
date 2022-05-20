import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class App114 {
    public static void main(String[] args) {
        String msv, ten;
        HashMap<String, String> hashMapSV = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien can nhap vao : ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            System.out.println("Nhap thong tin sinh vien thu "+i);
            System.out.println("Nhap ma sinh vien: ");
            msv = sc.nextLine();
            System.out.println("Nhap ho ten sinh vien: ");
            ten = sc.nextLine();
            hashMapSV.put(msv, ten);
        }
        Iterator<Map.Entry<String,String>> iterator = hashMapSV.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey()+"\t\t"+entry.getValue());
        }
        sc.close();
    }
    
}