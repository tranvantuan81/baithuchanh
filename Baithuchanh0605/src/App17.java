import java.util.ArrayList;
public class App17 {
    public static void main(String[] args) throws Exception {
       ArrayList<String> arrListString = new ArrayList<>();
       arrListString.add("JaVa");
       arrListString.add("PHP");
       arrListString.add("C#");
       arrListString.add("C++");

       System.out.println("Cac phan tu co trong arrListString la: "); 
       for(int i = 0; i < arrListString.size(); i++) {
           System.out.println(arrListString.get(i)+"\t");
       }
       arrListString.get(0);
       arrListString.remove(2);
       arrListString.set(1, "python");
       System.out.println("cac phan tu sau khi thay doi la ");
       for(int i = 0; i < arrListString.size(); i++) {
           System.out.println(arrListString.get(i));
           System.out.println(arrListString.remove(2));
           System.out.println(arrListString.set(1,"python"));
       }
    }
}
