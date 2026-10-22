package Recursion.AdvancedRecursion;

public class TowerOfHannoi {
    public static void toh(int n, char source, char destination, char helper) {
        if (n < 0) {
            throw new IllegalArgumentException("Number of disks cannot be negative");
        }
        if (n == 0) {
            return;
        }

        toh(n - 1, source, helper, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        toh(n - 1, helper, destination, source);
    }

    public static void main(String[] args) {
        int n = 3;
        toh(n, 'A', 'C', 'B');
    }
}
