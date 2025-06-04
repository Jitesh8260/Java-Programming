import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class CompareHashSet {
public static void main(String[] args) {
HashSet<Integer> set1 = new HashSet<>();
HashSet<Integer> set2 = new HashSet<>();
set1.add(1);
set1.add(2);
set1.add(3);
set2.add(2);
set2.add(3);
set2.add(4);
Set<Integer> commonElements = new TreeSet<>(set1);
commonElements.retainAll(set2);
System.out.println("Common elements: " + commonElements);
}
}