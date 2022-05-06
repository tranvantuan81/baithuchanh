import java.util.ArrayList;
import java.util.Iterator;
public class App19 {
    public static void main(String[] args) throws Exception { 
   ArrayList<Character> arrListChar = new ArrayList<>();
   arrListChar.add('a');
   arrListChar.add('e');
   arrListChar.add('b');
   arrListChar.add('c');
   Iterator<Character> listiIterator = arrListChar.listIterator();
   System.out.println("Cac phan tu trong arrList la");
   while(listiIterator.hasNext()) {
       System.out.println(listiIterator.next() +"\t");
   }
}
}
