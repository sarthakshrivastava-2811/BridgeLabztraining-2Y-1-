import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ISR2_InputToFile {

    static final String STOP = "exit";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String path = reader.readLine();
            try (FileWriter writer = new FileWriter(path)) {
                String line;
                while ((line = reader.readLine()) != null && !line.equals(STOP))
                    writer.write(line + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
