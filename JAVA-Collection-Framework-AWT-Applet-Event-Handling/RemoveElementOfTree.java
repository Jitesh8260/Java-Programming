
import java.util.TreeSet;
public class RemoveElementOfTree{
public static void main(String[] args) {
TreeSet<Integer> treeSet = new TreeSet<>();
treeSet.add(10);
treeSet.add(20);
treeSet.add(30);
treeSet.add(40);
treeSet.add(50);
int specifiedValue = 35;
treeSet.headSet(specifiedValue).clear();
System.out.println("TreeSet after removing elements less than " + specifiedValue + ":");
for (int element : treeSet) {
System.out.println(element);
}
}
}