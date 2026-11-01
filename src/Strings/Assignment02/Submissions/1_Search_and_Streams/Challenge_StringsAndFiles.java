import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Challenge_StringsAndFiles {

    static final int COUNT = 1000000;
    static final String WORD = "hello";

    static long countWords(Reader source) throws IOException {
        long words = 0;
        try (BufferedReader reader = new BufferedReader(source)) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) words += line.split("\\s+").length;
            }
        }
        return words;
    }

    public static void main(String[] args) throws IOException {
        long start = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < COUNT; i++) builder.append(WORD);
        System.out.println("StringBuilder: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < COUNT; i++) buffer.append(WORD);
        System.out.println("StringBuffer: " + (System.nanoTime() - start) + " ns");

        String path = new Scanner(System.in).nextLine();

        start = System.nanoTime();
        long words = countWords(new FileReader(path));
        System.out.println("FileReader: " + words + " words, " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        words = countWords(new InputStreamReader(new FileInputStream(path)));
        System.out.println("InputStreamReader: " + words + " words, " + (System.nanoTime() - start) + " ns");
    }
}
