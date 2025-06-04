import java.util.Scanner;
class SubStrings{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string to find its sub-strings: ");
String s=sc.nextLine();
System.out.println("Sub-strings of the string \"" + s + "\" are");
for(int i=0;i<s.length();i++){
for(int j=i;j<s.length();j++){
System.out.println(s.substring(i,j+1));
}
}
}
}