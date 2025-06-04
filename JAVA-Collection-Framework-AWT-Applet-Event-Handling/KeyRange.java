import java.util.Map;
import java.util.TreeMap;
public class KeyRange {
public static void main(String[] args) {
TreeMap<Integer, String> map = new TreeMap<>();
map.put(1, "One");
map.put(2, "Two");
map.put(3, "Three");
map.put(4, "Four");
map.put(5, "Five");
map.put(6, "Six");
Map<Integer, String> portion = map.subMap(2, 5);
for (Map.Entry<Integer, String> entry : portion.entrySet()) {
System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}
}
}