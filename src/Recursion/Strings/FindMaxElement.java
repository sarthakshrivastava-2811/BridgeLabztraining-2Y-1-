package Recursion.Strings;

public class FindMaxElement {
    public static void maxelement(String name, int index) {
        if (index == name.length()) {
            return;


        }
        maxelement(name, index + 1);
        System.out.println(name.charAt(index));
    }

    public static boolean palindrome(String name, int index) {
        if (index >= name.length() / 2) {
            return true;
        }
        if (name.charAt(index) != name.charAt(name.length() - index - 1)) {
            return false;
        }
        return palindrome(name, index + 1);
    }

    public static void main(String[] args) {
        String name = "dorara";
        maxelement(name, 0);
        System.out.println(palindrome(name, 0));
    }
}