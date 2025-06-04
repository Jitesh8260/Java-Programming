import java.util.Scanner;
public class capitaliseword {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a sentence: ");
String sentence = scanner.nextLine();
String[] words = sentence.split(" ");
StringBuilder capitalizedSentence = new StringBuilder();
for (String word : words) {
if (!word.isEmpty()) {
char firstLetter = Character.toUpperCase(word.charAt(0));
String restOfWord = word.substring(1);
capitalizedSentence.append(firstLetter).append(restOfWord).append(" ");
}
}
System.out.println(capitalizedSentence.toString().trim());
}
}