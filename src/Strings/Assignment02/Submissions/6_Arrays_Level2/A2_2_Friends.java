import java.util.Scanner;

public class A2_2_Friends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[names.length];
        double[] heights = new double[names.length];

        for (int i = 0; i < names.length; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        int youngest = 0, tallest = 0;
        for (int i = 1; i < names.length; i++) {
            if (ages[i] < ages[youngest]) youngest = i;
            if (heights[i] > heights[tallest]) tallest = i;
        }

        System.out.println("Youngest: " + names[youngest]);
        System.out.println("Tallest: " + names[tallest]);
    }
}
