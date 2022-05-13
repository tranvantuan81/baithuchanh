import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
public class App106 {
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();
        treeMap.put(1, 'A');
        treeMap.put(4, 'B');
        treeMap.put(6, 'C');
        treeMap.put(7, 'D');
        Set<Map.Entry<Integer, Character>> setTreeMap = treeMap.entrySet();
        System.out.println("Cac entry co trong setTreeMap");
        System.out.println(setTreeMap);
    }
}
