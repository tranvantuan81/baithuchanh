import java.util.ArrayList;
import java.util.Iterator;
public class App18 {
    public static void main(String[] args) throws Exception {
        ArrayList<Float> arrListFloat = new ArrayList<>();
        arrListFloat.add(0.7f);
        arrListFloat.add(7.26f);
        arrListFloat.add(1.02f);
        arrListFloat.add(9.3f);
        Iterator<Float> iterator = arrListFloat.iterator();
        System.out.println("Cac phan tu co tong arrlistFloat la ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() +"\t");
        }
    }        
}
