public class anagram {
    public static void main(String[] args) {
    String str1 = "Debit card";
    String str2 = "Bad credit";
    str1 = str1.replaceAll("\\s", "").toLowerCase();
    str2 = str2.replaceAll("\\s", "").toLowerCase();
    if (str1.length() != str2.length()) {
    System.out.println("The input strings are not Anagram");
    return;
    }
    for (int i = 0; i < str1.length(); i++) {
    char c = str1.charAt(i);
    if (str2.indexOf(c) == -1) {
    System.out.println("The input strings are not Anagram");
    return;
    }
    }
    System.out.println("The input strings are Anagram");
    }}