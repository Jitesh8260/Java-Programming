import java.util.ArrayList;

public class ArrayListReplace{
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("apple");
        myArrayList.add("banana");
        myArrayList.add("cherry");
        System.out.println("Original ArrayList: " + myArrayList);

        myArrayList.set(1, "blueberry");

        System.out.println("ArrayList after replacement: " + myArrayList);
    }
}
