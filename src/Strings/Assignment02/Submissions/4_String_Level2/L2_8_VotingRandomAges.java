import java.util.Scanner;

public class L2_8_VotingRandomAges {

    static final int VOTING_AGE = 18;

    static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = 10 + (int) (Math.random() * 90);
        return ages;
    }

    static String[][] votingStatus(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = String.valueOf(ages[i] >= VOTING_AGE);
        }
        return result;
    }

    static void display(String[][] table) {
        System.out.println("Age\tCan Vote");
        for (String[] row : table) System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        int students = new Scanner(System.in).nextInt();
        if (students < 1) {
            System.out.println("Invalid number");
            return;
        }
        display(votingStatus(generateAges(students)));
    }
}
