import java.util.LinkedList;
public class comparelinkedlist {
public static void main(String[] args) {
LinkedList<String> list1 = new LinkedList<>();
list1.add("Red");
list1.add("Green");
list1.add("Blue");
LinkedList<String> list2 = new LinkedList<>();
list2.add("Red");
list2.add("Green");
list2.add("Blue");
boolean areEqual = list1.equals(list2);
if (areEqual) {
System.out.println("Both linked lists contain the same elements.");
} else {
System.out.println("The linked lists do not contain the same elements.");
}
}
}