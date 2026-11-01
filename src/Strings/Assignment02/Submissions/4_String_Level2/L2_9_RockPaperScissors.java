import java.util.Scanner;

public class L2_9_RockPaperScissors {

    static final String[] CHOICES = {"rock", "paper", "scissors"};

    static String computerChoice() {
        return CHOICES[(int) (Math.random() * CHOICES.length)];
    }

    static String winner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        boolean userWins = user.equals("rock") && computer.equals("scissors")
                || user.equals("paper") && computer.equals("rock")
                || user.equals("scissors") && computer.equals("paper");
        return userWins ? "User" : "Computer";
    }

    static String[][] stats(int userWins, int computerWins, int games) {
        return new String[][]{
            {"User", String.valueOf(userWins), String.format("%.2f", (double) userWins / games), String.format("%.2f", 100.0 * userWins / games)},
            {"Computer", String.valueOf(computerWins), String.format("%.2f", (double) computerWins / games), String.format("%.2f", 100.0 * computerWins / games)}
        };
    }

    static boolean valid(String choice) {
        for (String c : CHOICES)
            if (c.equals(choice)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        if (games < 1) {
            System.out.println("Invalid number");
            return;
        }
        int userWins = 0, computerWins = 0;
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 1; i <= games; i++) {
            String user = sc.next().toLowerCase();
            while (!valid(user)) user = sc.next().toLowerCase();
            String computer = computerChoice(), result = winner(user, computer);
            if (result.equals("User")) userWins++;
            else if (result.equals("Computer")) computerWins++;
            System.out.println(i + "\t" + user + "\t" + computer + "\t\t" + result);
        }
        System.out.println("Player\tWins\tAverage\tPercentage");
        for (String[] row : stats(userWins, computerWins, games))
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
    }
}
