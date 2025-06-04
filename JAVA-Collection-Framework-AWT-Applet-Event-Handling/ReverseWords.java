import java.util.Stack;
public class ReverseWords {
public static String reverseWords(String sentence) {
String[] words = sentence.split(" ");
Stack<String> stack = new Stack<>();
for (String word : words) {
stack.push(word);
}
StringBuilder reversedSentence = new StringBuilder();
while (!stack.isEmpty()) {
reversedSentence.append(stack.pop()).append(" ");
}
return reversedSentence.toString().trim();
}
public static void main(String[] args) {
String sentence = "Hello world , how are you?";
String reversedSentence = reverseWords(sentence);
System.out.println(reversedSentence);
}
}