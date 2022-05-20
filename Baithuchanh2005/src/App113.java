import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
public class App113 {
    public static void main(String[] args) {
        String traiCay;
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        System.out.print("Nhap so trai cay ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++) {
            System.out.println("Nhap loai trai cay " + i+ " ");
            traiCay = sc.nextLine();
            hashSet.add(traiCay);
        }
        System.out.println("So loai trai cay co trong hashSet la " +hashSet.size());
        System.out.println("Nhap loai trai cay can tim ");
        String loaiTraiCay = sc.nextLine();
        if(hashSet.contains(loaiTraiCay)) {
            System.out.println("Co loai trai cay " +loaiTraiCay+ " trong hashSet");    
        }
        else {
            System.out.println("Khong co loai tai cay " +loaiTraiCay+" trong hashSet");
        }
        System.out.println("Nhap loai trai cay can xoa ");
        String xoaTraiCay = sc.nextLine();
        if(hashSet.contains(xoaTraiCay)) {
            hashSet.remove(xoaTraiCay);
        }
        System.out.println("So trai cay co trong hashSet la ");
        System.out.println(hashSet);
        List<String> listFruits = new ArrayList<>();
    listFruits.add("cam");
    listFruits.add("tao");
    listFruits.add("man");
    hashSet.addAll(listFruits);
    System.out.println("Các phần tử có trong hashSetFruits sau khi thêm: ");
    Iterator<String> iterator = hashSet.iterator();
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + "\t");
    }
    hashSet.removeAll(listFruits);
    System.out.println("Cac phan tu co trong hashSet sau khi xoa");
    System.out.println(hashSet);
        sc.close();
    }
}
