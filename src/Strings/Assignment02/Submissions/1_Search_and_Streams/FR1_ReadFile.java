import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FR1_ReadFile {

    public static void main(String[] args) {
        String path = new Scanner(System.in).nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) System.out.println(line);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
