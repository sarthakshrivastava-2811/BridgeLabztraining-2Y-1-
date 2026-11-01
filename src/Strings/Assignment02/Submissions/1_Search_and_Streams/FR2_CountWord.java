import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FR2_CountWord {

    static int countWord(String path, String target) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null)
                for (String word : line.split("\\W+"))
                    if (word.equalsIgnoreCase(target)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        String target = sc.nextLine();
        try {
            System.out.println(countWord(path, target));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
