import java.util.Scanner;
public class countcharacter {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the String: ");
String input = scanner.nextLine();
for (int i = 0; i < input.length(); i++) {
char c = input.charAt(i);
int count = 0;
for (int j = 0; j < input.length(); j++) {
if (input.charAt(j) == c) {
count++;
}
}
System.out.println("The Character " + c + " has occurred " + count + " times");
}
}
}