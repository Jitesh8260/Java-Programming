import java.lang.String;
import java.util.Arrays;
public class removespaces {
    public static void main(String[] args) {
    String days = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
    String[] dayArr = days.split(" ");
    System.out.println(days);
    StringBuilder rev = new StringBuilder();
    for (int i = dayArr.length - 1; i >= 0; i--) {
    rev.append(dayArr[i]).append(" ");
    }
    System.out.println(rev.toString());
    }
    }