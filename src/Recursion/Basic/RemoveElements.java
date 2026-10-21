package Recursion.Basic;

public class RemoveElements {
    public static void removeElements(int arr[], int target, int index) {

        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            System.out.println("Element found at index: " + index);
        }
        removeElements(arr, target, index + 1);
    }

    public static String removeCharacter(String name, char target, int index) {
        if (index == name.length()) {
            return "";
        }

        char current = name.charAt(index);
        String remaining = removeCharacter(name, target, index + 1);
        if (current == target) {
            return remaining;
        }
        return current + remaining;
    }

    public static void main(String[] args) {
        String name = "banana";
        char target = 'a';
        System.out.println(removeCharacter(name, target, 0));
    }
}
